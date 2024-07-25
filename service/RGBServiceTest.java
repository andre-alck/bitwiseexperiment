public class RGBServiceTest extends TestSuite {

    public static void main(String[] args) {
        RGBServiceTest rgbServiceTest = new RGBServiceTest();
        rgbServiceTest.runClassTests();
    }

    @TestMe
    public void negativeShouldBeClampedToZero() {
        RGBService rgbService = new RGBService();
        int result = rgbService.clamp(-1);
        MiniTest.assertThat(result).isEqualTo(0);
    }

    @TestMe
    public void valueGreaterThan255ShouldBeClampedTo255() {
        RGBService rgbService = new RGBService();
        int result = rgbService.clamp(256);
        MiniTest.assertThat(result).isEqualTo(255);
    }

    @TestMe
    public void valueInRangeShouldNotBeClamped() {
        RGBService rgbService = new RGBService();
        int result = rgbService.clamp(200);
        MiniTest.assertThat(result).isEqualTo(200);
    }

}