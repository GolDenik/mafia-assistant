package core.basesyntax.service;

import core.basesyntax.dto.OutputDto;
import core.basesyntax.model.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizerServiceImpl implements RandomizerService {
    @Override
    public List<OutputDto> randomize(List<String> players, List<Role> roles) {
        List<OutputDto> output = new ArrayList<>();
        List<Role> rolesCopy = new ArrayList<>(roles);
        Random random = new Random();
        players.forEach(player -> output.add(new OutputDto(player,
                rolesCopy.remove(random.nextInt(rolesCopy.size())).getValue())));
        return output;
    }
}
