package core.basesyntax.service;

import core.basesyntax.dto.InputDto;
import core.basesyntax.dto.OutputDto;
import core.basesyntax.model.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class ProcessorServiceImpl implements ProcessorService {
    private static final double DEFAULT_COEFFICIENT = 3.5;
    private RandomizerService randomizerService;
    private Integer mafiaAmount;

    public ProcessorServiceImpl(RandomizerService randomizerService) {
        this.randomizerService = randomizerService;
    }

    public ProcessorServiceImpl(RandomizerService randomizerService, int mafiaAmount) {
        this.randomizerService = randomizerService;
        this.mafiaAmount = mafiaAmount;
    }

    @Override
    public List<OutputDto> process(InputDto inputDto) {
        List<Role> roles = new ArrayList<>();

        if (mafiaAmount == null) {
            mafiaAmount = (int) Math.round(inputDto.getNumberOfPlayers() / DEFAULT_COEFFICIENT);
        }
        IntStream.range(1, mafiaAmount).forEach(n -> roles.add(Role.MAFIA));

        inputDto.getOptionalRoles().entrySet().stream()
                .filter(Map.Entry::getValue)
                .forEach(e -> roles.add(e.getKey()));

        if (!roles.contains(Role.DON)) {
            roles.add(Role.MAFIA);
        }

        while (roles.size() < inputDto.getNumberOfPlayers()) {
            roles.add(Role.CIVILIAN);
        }
        return randomizerService.randomize(inputDto.getPlayerNames(), roles);
    }
}
