package core.basesyntax.dto;

import core.basesyntax.model.Role;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class InputDto {
    private int numberOfPlayers;
    private List<String> playerNames;
    private Map<Role, Boolean> optionalRoles;

    public InputDto() {
        optionalRoles = new HashMap<>();
        optionalRoles.put(Role.DETECTIVE, false);
        optionalRoles.put(Role.DOCTOR, false);
        optionalRoles.put(Role.DON, false);
        optionalRoles.put(Role.SERIAL_KILLER, false);
        optionalRoles.put(Role.PROSTITUTE, false);
    }

    public InputDto(boolean isDoctorPresent, boolean isDonPresent, boolean isDetectivePresent,
                    boolean isSerialKillerPresent, boolean isProstitutePresent) {
        optionalRoles = new HashMap<>();
        optionalRoles.put(Role.DETECTIVE, isDetectivePresent);
        optionalRoles.put(Role.DOCTOR, isDoctorPresent);
        optionalRoles.put(Role.DON, isDonPresent);
        optionalRoles.put(Role.SERIAL_KILLER, isSerialKillerPresent);
        optionalRoles.put(Role.PROSTITUTE, isProstitutePresent);
    }
}
