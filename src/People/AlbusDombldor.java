package People;
import Enum.*;
public class AlbusDombldor extends Person {
    public AlbusDombldor(String name) {
        super(name);
    }

    @Override
    public void sit() {
        System.out.println("Рядом сидел " + getName() + ".");

    }
}
