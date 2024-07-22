public class OrBitwiseInteractable {
    public static void main(String[] args) {
        Interactable interactable = new Interactable();
        Integer red = (Integer) interactable.getArgument(args, 0, Integer.class);
        Integer green = (Integer) interactable.getArgument(args, 1, Integer.class);
        Integer blue = (Integer) interactable.getArgument(args, 2, Integer.class);

        RGBService rgbService = new RGBService();
        int rgb = rgbService.getRGB(red, green, blue);

        MiniTest.logForDebugging(Integer.toHexString(rgb));
    }
}