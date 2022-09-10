package core.basesyntax.model;

public enum Role {
    CIVILIAN("Civilian"),
    MAFIA("Mafia"),
    DETECTIVE("Detective"),
    DOCTOR("Doctor"),
    DON("Don of Mafia"),
    SERIAL_KILLER("Serial Killer"),
    PROSTITUTE("Prostitute"),
    THIEF("Thief"),
    YAKUZA("Yakuza");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
