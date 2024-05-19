public class LEDDisplay implements IDisplay {
    private double width;
    private double height;

    public LEDDisplay(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double countPixels() {
        return width*height;
    }

    @Override
    public String getDisplayInfo() {
        return "LED Display: " + width + "x" + height + " inches";
    }
}