public class XorBitwiseInteractable {
    public static void main(String[] args) {
        Interactable interactable = new Interactable();
        String user = (String) interactable.getArgument(args, 0, String.class);
        Integer password = (Integer) interactable.getArgument(args, 1, Integer.class);

        LoginService loginService = new LoginService();
        boolean result = loginService.login(user, password);

        MiniTest.assertThat(result).isEqualTo(true);
    }
}