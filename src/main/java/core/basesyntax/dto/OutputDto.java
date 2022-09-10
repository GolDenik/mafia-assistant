package core.basesyntax.dto;

public class OutputDto {
    private String playerName;
    private String role;

    public OutputDto(String playerName, String role) {
        this.playerName = playerName;
        this.role = role;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "OutputDto{" 
                + "playerName='" + playerName + '\'' 
                + ", role='" + role + '\'' 
                + '}';
    }
}
