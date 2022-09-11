package core.basesyntax.dto;

import lombok.Data;

@Data
public class InputDto {
    private int numberOfPlayers;
    private String playerNames;
    private boolean isDoctorPresent;
    private boolean isDonPresent;
    private boolean isSerialKillerPresent;
    private boolean isProstitutePresent;
}
