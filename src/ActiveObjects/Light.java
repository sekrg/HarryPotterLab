package ActiveObjects;
import Buildings.Hogwarts;
import interfaces.Ilightable;

public class Light implements Ilightable {
    private String name;

    public Light() {
        this.name = "Свет";
    }

    public String getName() {
        return name;
    }
    public void light(){
        Hogwarts.hall x = new Hogwarts.hall("Зал");
        Hogwarts y = new Hogwarts("Хогвартсе");
        System.out.println(""+x.getName()+" был скудно освещен; что-то вроде подземелья без окон, свет дают факелы, развешанные по стенам, точь-в-точь такие, как в "+y.getName()+"");

    }

}
