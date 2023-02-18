package ActiveObjects;

public class Gas {
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
        System.out.println(""+getName()+" непрерывно двигалось: то его поверхность морщит рябь, как воду — дуновение ветра, то пробегают круги, завихрения: что это — сжиженный свет или газ, ставший студенистым телом?");
    }
    public void spin(){
        System.out.println("Непонятное "+getName()+" стало быстро вращаться.");
    }


}
