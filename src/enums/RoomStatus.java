package enums;

public enum RoomStatus {

    DARK("Без освещения"),
    LIGHT("Освещена");

    private final String status;

    RoomStatus(String status) {
        this.status = status;

    }

    @Override
    public String toString() {
        return status;
    }
}
