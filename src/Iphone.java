public class Iphone extends PortableDevice implements Callable{

    public Iphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from the smartphone...");
    }
    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Receiving a call from " + phoneNumber + " on the smartphone...");
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
    public void carryAround() {
        super.carryAround();
    }
}
