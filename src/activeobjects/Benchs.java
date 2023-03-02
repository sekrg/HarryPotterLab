package activeobjects;
import buildings.Hogwarts;
import activeobjects.*;
import enums.Interior;

public class Benchs {

    private String name;

    public Benchs() {
        this.name = "Скамьи";
    }

    public String getName() {
        return name;
    }
    public void up(Interior x){
        System.out.println("Вдоль стен до самого потолка амфитеатром поднимаются "+x.toString()+", заполненные волшебниками и волшебницами, посредине — пустое кресло, с подлокотников которого свисают цепи.");
    }
    public void be(){
        Hogwarts y = new Hogwarts("Хогвартсе");
        System.out.println("На скамьях только взрослые, а в "+y.getName()+" учителей раз в десять меньше.");
    }

}
