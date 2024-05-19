public class DesktopComputer<P extends IProcessor,D extends IDisplay> extends Сomputer<P,D> {

    public DesktopComputer(String brand, String model,  int weight, P processor,D display) {
        super(brand, model, weight, processor,display);
    }

    @Override
    public boolean turnOn() {
        return super.turnOn();
    }
    @Override
    public boolean turnOff() {
        return super.turnOff();
    }
    @Override
    public void performCalculation() {
        super.performCalculation();
    }


}
