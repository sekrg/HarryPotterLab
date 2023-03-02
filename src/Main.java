import activeobjects.Benchs;
import activeobjects.Gas;
import activeobjects.Light;
import exceptions.TimeException;
import people.*;
import enums.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        HarryPotter harryPotter = new HarryPotter();
        AlbusDombldor albusDombldor = new AlbusDombldor();
        Group group = new Group();
        Gas gas = new Gas();
        Light light = new Light();
        Benchs benchs = new Benchs();
        harryPotter.feel();

        try{
            harryPotter.talk((int) (Math.random()*60));
        } catch(TimeException ex){
            System.out.println(ex.getMessage());
        }

        harryPotter.lookup();
        harryPotter.saw(MagicObjects.HAT);
        harryPotter.found(MagicObjects.SWORD, MagicObjects.CASE, MagicObjects.WEAPON);
        harryPotter.extract(MagicObjects.HAT, MagicObjects.SWORD);
        harryPotter.rotate();
        harryPotter.saw(MagicObjects.PHOENIX);
        harryPotter.stand();
        harryPotter.come(Interior.WARDROBE);
        harryPotter.open(MagicObjects.BOTTLE, Interior.DOOR);
        gas.light();
        harryPotter.notsaw();
        gas.rotated();
        harryPotter.want();
        harryPotter.pull(MagicObjects.STICK);
        gas.spin();
        harryPotter.shove();
        harryPotter.saw();
        harryPotter.bent();
        light.light();
        benchs.up();
        harryPotter.scarred();
        benchs.be();
        group.waited();
        harryPotter.notsaw(MagicObjects.BOTTLE);
        harryPotter.bend();
        harryPotter.fly(MagicObjects.BOTTLE);
        harryPotter.sit();
        harryPotter.lookupp();
        harryPotter.breathe();
        group.sit();
        harryPotter.rotated();
        albusDombldor.sit();

    }
}
