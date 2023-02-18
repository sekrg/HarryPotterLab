package Enum;

public enum Places {
    CABINET("Кабинете Дамблдора"),
    XOGVARTS("ИТМО"),
    HALL("Зал");

    private String name;

    Places (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
