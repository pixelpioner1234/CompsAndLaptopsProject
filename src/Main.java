import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

    DesktopComputer<IProcessor,IDisplay> deskCopm = new DesktopComputer<>("ASUS","ExpertBook",3,new IntelProcessor("Intel",150), new RetinaDisplay(21.5, 12.5));
    Laptop<IProcessor,IDisplay> laptop = new Laptop<>("Dell", "XPS 13",2,new IntelProcessor("Intel",200),new RetinaDisplay(12.9, 9.7));
    Ipad<IProcessor, IDisplay> ipad = new Ipad<>("Apple", "iPad Pro",1,new AppleProcessor("M1",120),new LEDDisplay(5.9, 4.7));


    List<Сomputer<?,?>> computers = new ArrayList<>();
    computers.add(deskCopm);
    computers.add(laptop);
    computers.add(ipad);


    //CompUtils.analyzeComputers(computers);
    //CompUtils.sortByPower(computers);
    //CompUtils.sortByWeight(computers);
    //CompUtils.sortByDisplay(computers);





    for (Сomputer<?, ?> computer : computers) {
        System.out.println("Brand: " + computer.getBrand() + ", Model: " + computer.getModel());
    }







    }
}
