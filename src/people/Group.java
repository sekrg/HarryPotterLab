package people;
import interfaces.Waited;

public class Group extends Person implements Waited {
    public Group() {
        super("Толпа");
    }
    @Override
    public void waited (){
        System.out.println("Люди явно чего-то ждут: сидят молча, глаза у всех устремлены в одном направлении.");
    }
    @Override
    public void sit(){
        System.out.println("Никто из сидящих в комнате (а здесь собралось сотни две волшебников и волшебниц), казалось, не заметил свалившегося откуда-то сверху четырнадцатилетнего ученика.");
    }
}

