package activeobjects;
import buildings.Hogwarts;
import interfaces.lightable;

public class Light implements lightable {
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
        System.out.println(""+x.getName()+" был скудно освещен; что-то вроде подземелья без окон, "+shiny()+" , развешанным по стенам, точь-в-точь такие, как в "+y.getName()+"");

    }
    public String shiny(){
        return ""+getName()+" идет от факелов";
    }

}
