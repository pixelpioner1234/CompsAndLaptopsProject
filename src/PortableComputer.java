public abstract class PortableComputer<P extends IProcessor,D extends IDisplay> extends Сomputer<P,D> implements Portable {

    public PortableComputer(String brand, String model,int weight, P processor,D display) {
        super(brand, model, weight,processor,display);
    }

    @Override
    public void carryAround() {
        System.out.println("Carrying the portable computer around.");
    }
}
