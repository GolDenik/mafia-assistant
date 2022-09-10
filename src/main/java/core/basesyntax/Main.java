package core.basesyntax;

import core.basesyntax.model.Role;
import core.basesyntax.service.RandomizerService;
import core.basesyntax.service.RandomizerServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomizerService randomizerService = new RandomizerServiceImpl();
        System.out.println(randomizerService.randomize(List.of("Denik", "2", "3", "4", "5", "6", "7", "8", "9", "10"), 
                List.of(Role.CIVILIAN, Role.CIVILIAN, Role.CIVILIAN, Role.CIVILIAN, Role.DON,
                Role.MAFIA, Role.MAFIA, Role.MAFIA, Role.DETECTIVE, Role.DOCTOR)));
    }
}
