package core.basesyntax.service;

import core.basesyntax.dto.OutputDto;
import core.basesyntax.model.Role;
import java.util.List;

public interface RandomizerService {
    List<OutputDto> randomize(List<String> players, List<Role> roles);
}
