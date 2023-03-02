package people;
import interfaces.*;

public class AlbusDombldor extends Person implements Stand, Sit {
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

    public void talk(){
        System.out.println(""+getName()+"говорит");
    }
}
