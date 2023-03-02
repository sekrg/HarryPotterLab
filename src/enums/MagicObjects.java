package enums;

public enum MagicObjects {
    HAT("Волешбная шляпа"),
    SWORD("меч Годрика Гриффиндора"),
    PHOENIX("Фоукс"),
    STICK("Волебшная палочка"),
    BOTTLE("Сосуд"),
    CASE("Футляре"),
    WEAPON("Серебряный меч");



    private String name;

    MagicObjects(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
