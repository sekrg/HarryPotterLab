package enums;

public enum Interior {
    DOOR("Дверь"),
    WARDROBE("Шкафчику");

    private String name;

    Interior(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
