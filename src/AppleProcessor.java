public class AppleProcessor implements IProcessor {
    public String name;
    public int power;


    public AppleProcessor(String name,int power) {
        this.name = name;
        this.power = power;

    }
    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getProcessorInfo() {
        return "Power: " +power;
    }
}

