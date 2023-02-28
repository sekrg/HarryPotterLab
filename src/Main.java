import activeobjects.Benchs;
import activeobjects.Gas;
import activeobjects.Light;
import exceptions.TimeException;
import people.*;
import enums.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Person harryPotter = new HarryPotter();
        Person albusDombldor = new AlbusDombldor();
        Person group = new Group();
        Gas gas = new Gas();
        Light light = new Light();
        Benchs benchs = new Benchs();
        ((HarryPotter) harryPotter).feel();

        try{
            ((HarryPotter) harryPotter).talk((int) (Math.random()*60));
        } catch(TimeException ex){
            System.out.println(ex.getMessage());
        }

        ((HarryPotter) harryPotter).lookup();
        ((HarryPotter) harryPotter).saw(MagicObjects.HAT);
        ((HarryPotter) harryPotter).found(MagicObjects.SWORD);
        ((HarryPotter) harryPotter).extract(MagicObjects.HAT, MagicObjects.SWORD);
        ((HarryPotter) harryPotter).rotate();
        ((HarryPotter) harryPotter).saw(MagicObjects.PHOENIX);
        ((HarryPotter) harryPotter).stand();
        ((HarryPotter) harryPotter).come();
        ((HarryPotter) harryPotter).open(MagicObjects.BOTTLE);
        gas.light();
        ((HarryPotter) harryPotter).notsaw();
        gas.rotated();
        ((HarryPotter) harryPotter).want();
        ((HarryPotter) harryPotter).pull(MagicObjects.STICK);
        gas.spin();
        ((HarryPotter) harryPotter).shove();
        ((HarryPotter) harryPotter).saw();
        ((HarryPotter) harryPotter).bent();
        light.light();
        benchs.up();
        ((HarryPotter) harryPotter).scarred();
        benchs.be();
        ((Group) group).waited();
        ((HarryPotter) harryPotter).notsaw(MagicObjects.BOTTLE);
        ((HarryPotter) harryPotter).bend();
        ((HarryPotter) harryPotter).fly(MagicObjects.BOTTLE);
        harryPotter.sit();
        ((HarryPotter) harryPotter).lookupp();
        ((HarryPotter) harryPotter).breathe();
        group.sit();
        ((HarryPotter) harryPotter).rotated();
        albusDombldor.sit();

    }
}
