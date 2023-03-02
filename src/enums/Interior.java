package enums;

import activeobjects.Benchs;

public enum Interior {
    DOOR("дверь"),
    WARDROBE("шкафчику"),
    TABLE("стола"),
    BENCHS("скамьи");


    private String name;

    Interior(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
