import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompUtils {


    public static void analyzeComputers(List<? extends Сomputer<?,?>> computers) {
        for (Сomputer<?,?> computer : computers) {
            System.out.println("\n\nAnalyzing computer: " + computer.getBrand() + " " + computer.getModel());
            System.out.println(computer.getProcessor().getProcessorInfo());
            if (computer instanceof Portable) {
                System.out.println("This computer is portable.");
            } else {
                System.out.println("This computer is not portable.");
            }
            if (computer instanceof Callable) {
                System.out.println("This computer can make/receive calls.");
            } else {
                System.out.println("This computer cannot make/receive calls.");
            }
        }
    }


    public static  void sortByPower(List<? extends Сomputer<?, ?>> computers){
        Collections.sort(computers, Comparator.comparingInt(computer -> computer.getProcessor().getPower()));
    }

    public static  void sortByDisplay(List<? extends Сomputer<?, ?>> computers){
        Collections.sort(computers, Comparator.comparingDouble(computer -> computer.getDisplay().countPixels()));
    }

    public static  void sortByWeight(List<? extends Сomputer<?, ?>> computers){
        Collections.sort(computers, Comparator.comparingInt(computer -> computer.getWeight()));
    }



}
