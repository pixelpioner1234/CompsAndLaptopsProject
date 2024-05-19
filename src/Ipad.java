public class Ipad<P extends IProcessor,D extends IDisplay> extends PortableComputer<P,D>{

    public Ipad(String brand, String model, int weight, P processor,D display) {
        super(brand, model, weight, processor,display);
    }

    @Override
    public void carryAround() {
        super.carryAround();
    }
}
