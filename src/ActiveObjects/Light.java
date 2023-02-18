package ActiveObjects;
import Enum.*;

public class Light {
    private String name;

    public Light() {
        this.name = "Свет";
    }

    public String getName() {
        return name;
    }
    public void light(Places x, Places y){
        System.out.println(""+x.getName()+" был скудно освещен; что-то вроде подземелья без окон, свет дают факелы, развешанные по стенам, точь-в-точь такие, как в "+y.getName()+".");

    }
}
