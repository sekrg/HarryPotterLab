import ActiveObjects.Benchs;
import ActiveObjects.Gas;
import ActiveObjects.Light;
import People.*;
import Enum.*;

public class Main {
    public static void main(String[] args) {
        HarryPotter x = new HarryPotter("Гарри Поттер");
        Gas z = new Gas();
        Light y = new Light();
        Benchs c = new Benchs();
        x.feel(Places.CABINET);
        x.talk();
        x.vskinul();
        x.saw(MagicObjects.HAT);
        x.found(MagicObjects.SWORD);
        x.retrieved(MagicObjects.HAT);
        x.rotate();
        x.saw(MagicObjects.PHOENIX);
        x.stand();
        x.come();
        x.open(MagicObjects.BOTTLE);
        z.light();
        x.notsaw();
        z.rotated();
        x.want();
        x.pull(MagicObjects.STICK);
        z.spin();
        x.shove();
        x.saw(Places.HALL);
        x.bent();
        y.light(Places.HALL, Places.XOGVARTS);
        c.up();
    }
}
