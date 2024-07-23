public class LoginServiceTest extends TestSuite {

    public static void main(String[] args) {
        LoginServiceTest loginServiceTest = new LoginServiceTest();
        loginServiceTest.runClassTests();
    }

    @TestMe
    public void userIsPresent() {
        LoginService loginService = new LoginService();
        boolean result = loginService.isUserPresent("monica.amorzinho");
        MiniTest.assertThat(result).isEqualTo(true);
    }

    @TestMe
    public void userIsNotPresent() {
        LoginService loginService = new LoginService();
        boolean result = loginService.isUserPresent("andre#carvalho");
        MiniTest.assertThat(result).isEqualTo(false);
    }

    @TestMe
    public void userIsNull() {
        LoginService loginService = new LoginService();
        boolean result = loginService.isUserPresent(null);
        MiniTest.assertThat(result).isEqualTo(false);
    }

    @TestMe
    public void userIsEmpty() {
        LoginService loginService = new LoginService();
        boolean result = loginService.isUserPresent("");
        MiniTest.assertThat(result).isEqualTo(false);
    }

    @TestMe
    public void throwIfUserIsNotPresentAndTriedToLogin() {
        LoginService loginService = new LoginService();

        String exceptionMessage = null;
        try {
            loginService.login("andre#carvalho", null);
        } catch (Exception e) {
            exceptionMessage = e.getMessage();
        }

        MiniTest.assertThat(exceptionMessage).isEqualTo(LoginService.USER_IS_NOT_PRESENT_EXCEPTION_MESSAGE);
    }

    @TestMe
    public void nullPasswordShouldNotLogin() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("andre.carvalho", null);
        MiniTest.assertThat(result).isEqualTo(false);
    }

    @TestMe
    public void wrongPasswordShouldNotLogin() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("andre.carvalho", 67890);
        MiniTest.assertThat(result).isEqualTo(false);
    }

    @TestMe
    public void rightPasswordShouldNotLogin() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("monica.amorzinho", 67890);
        MiniTest.assertThat(result).isEqualTo(true);
    }
}