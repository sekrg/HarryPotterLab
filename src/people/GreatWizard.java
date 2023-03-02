package people;
import exceptions.CloneException;
import interfaces.*;

public class GreatWizard extends Person implements Stand, Sit {

    String name;

    public GreatWizard(String name) {
        super(name);
    }

    @Override
    public void sit() {
        if(this.getName().equals("Альбус Дамблдор")) {
            System.out.println("Рядом сидел " + getName() + ".");
        }
        else throw new CloneException("Это был не директор академии");
    }

    @Override
    public void stand() {
        System.out.println(""+getName()+" стоит");
    }

    public void talk(){
        System.out.println(""+getName()+"говорит");
    }
}