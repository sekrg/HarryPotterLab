package People;
import Enum.Places;
import Enum.MagicObjects;

public class HarryPotter extends Person {
    public HarryPotter(String name) {
        super(name);
    }

    public void feel(Places x) {
        System.out.println("В " + x.getName() + " " + getName() + " чувствовал себя гораздо спокойнее");
    }

    public void talk() {
        System.out.println(": еще полчаса, и " + getName() + " расскажет директору о своем сне.");
    }

    public void vskinul() {
        System.out.println("" + getName() + " вскинул глаза на стену позади стола");
    }

    public void found(MagicObjects x) {
        System.out.println("Рядом с ней в стеклянном футляре покоился украшенный рубинами серебряный меч." + getName() + " сразу узнал его — " + x.getName() + ", основателя их факультета.");
    }

    public void retrieved(MagicObjects x) {
        System.out.println("Это его " + getName() + " извлек тогда в подземелье из " + x.getName() + ". ");
    }

    public void rotate() {
        System.out.println("" + getName() + " обернулся назад — черный шкафчик на подставке неплотно закрыт, из щелки падает яркая мерцающая полоска света");
    }

    public void saw(MagicObjects x) {
        if (x.equals(MagicObjects.PHOENIX)) {
            System.out.println("" + getName() + " бросил взгляд на Фоукса");
        }
        else if (x.equals(MagicObjects.HAT)) {
            System.out.println("и увидел на полке старую, залатанную " + x.getName() + ".");

        }

    }

    public void stand() {
        System.out.println("Встал из-за стола.");
    }

    public void come() {
        System.out.println("Подошел к шкафчику");
    }

    public void open(MagicObjects x) {
        System.out.println("Решительно потянул на себя дверцу. Внутри стоял неглубокий каменный " + x.getName() + ", опоясанный по краю резными письменами и символами.");
    }

    public void notsaw() {
        System.out.println("Ничего подобного Гарри никогда не видел, даже не мог понять, жидкость это или газ.");
    }

    public void want() {
        System.out.println("" + getName() + " очень захотел провести по нему ладонью, ощутить пальцами, но почти четыре года в Школе чародейства и волшебства подсказали: окунать руку в сосуд непонятно с чем было бы верхом глупости.");
    }

    public void pull(MagicObjects x) {
        System.out.println("" + getName() + " вытащил " + x.getName() + ", настороженно огляделся и легонько ткнул содержимое палочкой");
    }

    public void shove() {
        System.out.println("Сунув голову в шкафчик," + getName() + " заглянул в сосуд");
    }

    public void saw(Places x) {
            System.out.println(" Дна не было — где-то глубоко открывался "+x.getName()+", как будто " + getName() + " смотрит в круглое окно, находящееся у нее в потолке.");
        }
    public  void bent(){
        System.out.println(""+getName()+" склонился так низко, что почти коснулся носом подобия стекла.");
    }
    public void scarred(){
        System.out.println("Сердце у "+getName()+" сжалось: неужели всякого, кто сядет в кресло, прикуют к нему? ");
    }




}
