package people;
import buildings.*;
import interfaces.Sit;

public class Group extends Person implements Sit {
    public Group() {
        super("Толпа");
    }
    public void waited (){
        System.out.println(""+getName()+" явно чего-то ждет: сидят молча, глаза у всех устремлены в одном направлении.");
    }
    @Override
    public void sit(){
        Hogwarts.room x = new Hogwarts.room("комната");
        System.out.println("Никто из сидящих в "+x.getName()+" (а здесь собралось сотни две волшебников и волшебниц), казалось, не заметил свалившегося откуда-то сверху четырнадцатилетнего ученика.");
    }
}

