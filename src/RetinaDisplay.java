public class RetinaDisplay implements IDisplay {
    private double width;
    private double height;

    public RetinaDisplay(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double countPixels() {
        return width*height;
    }

    @Override
    public String getDisplayInfo() {
        return "Retina Display: " + width + "x" + height + " inches";
    }
}