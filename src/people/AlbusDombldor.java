package people;

public class AlbusDombldor extends Person {
    public AlbusDombldor() {
        super("Альбус Дамблдор");
    }

    @Override
    public void sit() {
        System.out.println("Рядом сидел " + getName() + ".");

    }


}
