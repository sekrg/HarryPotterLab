package people;
import interfaces.*;

public class AlbusDombldor extends Person implements Stand {
    public AlbusDombldor() {
        super("Альбус Дамблдор");
    }

    @Override
    public void sit() {
        System.out.println("Рядом сидел " + getName() + ".");

    }


    @Override
    public void stand() {
        System.out.println(""+getName()+" стоит");
    }
}
