import ActiveObjects.Benchs;
import ActiveObjects.Gas;
import ActiveObjects.Light;
import Exceptions.TimeException;
import People.*;
import Enum.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Person x = new HarryPotter("Гарри Поттер");
        Person q = new AlbusDombldor("Альбус Дамблдор");
        Person v = new Group("Люди");
        Gas z = new Gas();
        Light y = new Light();
        Benchs c = new Benchs();
        ((HarryPotter) x).feel();

        try{
            ((HarryPotter) x).talk((int) (Math.random()*60));
        } catch(TimeException ex){
            System.out.println(ex.getMessage());
        }

        ((HarryPotter) x).lookup();
        ((HarryPotter) x).saw(MagicObjects.HAT);
        ((HarryPotter) x).found(MagicObjects.SWORD);
        ((HarryPotter) x).retrieved(MagicObjects.HAT);
        ((HarryPotter) x).rotate();
        ((HarryPotter) x).saw(MagicObjects.PHOENIX);
        ((HarryPotter) x).stand();
        ((HarryPotter) x).come();
        ((HarryPotter) x).open(MagicObjects.BOTTLE);
        z.light();
        ((HarryPotter) x).notsaw();
        z.rotated();
        ((HarryPotter) x).want();
        ((HarryPotter) x).pull(MagicObjects.STICK);
        z.spin();
        ((HarryPotter) x).shove();
        ((HarryPotter) x).saw();
        ((HarryPotter) x).bent();
        y.light();
        c.up();
        ((HarryPotter) x).scarred();
        c.be();
        ((Group) v).waited();
        ((HarryPotter) x).notsaw(MagicObjects.BOTTLE);
        ((HarryPotter) x).bend();
        ((HarryPotter) x).fly(MagicObjects.BOTTLE);
        x.sit();
        ((HarryPotter) x).lookupp();
        ((HarryPotter) x).breathe();
        v.sit();
        ((HarryPotter) x).rotated();
        q.sit();

    }
}
