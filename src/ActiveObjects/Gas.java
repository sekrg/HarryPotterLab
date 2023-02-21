package ActiveObjects;
import interfaces.Ilightable;

public class Gas implements Ilightable {

    private String name;

    public String getName() {
        return name;
    }

    public Gas() {
        this.name = "Вещество";
    }

    public void light(){
        System.out.println(""+getName()+" ярко серебристо светилось. ");
    }
    public void rotated(){
        class wind{
            String name = "Дуновение ветра";
            public String getName() {
                return name;
            }
        }
        wind x = new wind();
        System.out.println(""+getName()+" непрерывно двигалось: то его поверхность морщит рябь, как воду — "+x.getName()+", то пробегают круги, завихрения: что это — сжиженный свет или газ, ставший студенистым телом?");
    }
    public void spin(){
        System.out.println("Непонятное "+getName()+" стало быстро вращаться.");
    }


}
