public class RGBService {
    public int getRGB(int red, int green, int blue) {
        red = this.clamp(red);
        green = this.clamp(green);
        blue = this.clamp(blue);

        return red << 16 | green << 8 | blue;
    }

    public int clamp(int value) {
        value = Math.max(0, Math.min(255, value));
        return value;
    }
}