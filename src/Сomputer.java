public abstract class Сomputer<P extends IProcessor,D extends IDisplay> implements Activatable {
    public String brand;
    public String model;
    public int weight;
    public P processor;
    public D display;


    public Сomputer(String brand, String model, int weight,P processor,D display) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.processor = processor;
        this.display = display;

    }
    public String getBrand() {return brand; }
    public String getModel() { return model; }
    public int getWeight() { return weight; }
    public  P getProcessor() { return processor; }
    public D getDisplay() { return display; }



    @Override
    public boolean turnOn() {
        System.out.println("The computer is now on.");
        return true;
    }
    @Override
    public boolean turnOff() {
        System.out.println("The computer is now off.");
        return false;
    }

    public void performCalculation(){
        System.out.println("Performing a complex calculation...");
    };

}
