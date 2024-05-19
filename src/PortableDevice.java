public abstract class PortableDevice implements Portable,Activatable {
    private String brand;
    private String model;

    public PortableDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() { return brand; }
    public String getModel() { return model; }

    @Override
    public boolean turnOn() {
        System.out.println("The portable device is now on.");
        return true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("The portable device is now off.");
        return false;
    }

    @Override
    public void carryAround() {
        System.out.println("Carrying the portable computer around.");    }
}


