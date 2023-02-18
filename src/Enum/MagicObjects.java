package Enum;

public enum MagicObjects {
    HAT("Волешбная шляпа"),
    SWORD("меч Годрика Гриффиндора"),
    PHOENIX("Фоукс"),
    STICK("Волебшная палочка"),
    BOTTLE("Сосуд");

    private String name;

    MagicObjects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
