public class InteractableTest extends TestSuite {

    @TestMe
    public void argumentIsNull() {
        Interactable interactable = new Interactable();
        boolean argumentExists = interactable.argumentExists(null, -1);
        MiniTest.assertThat(argumentExists).isEqualTo(false);
    }

    @TestMe
    public void argumentExistsButPositionIsEqualToItsLength() {
        Interactable interactable = new Interactable();
        boolean argumentExists = interactable.argumentExists(new String[] { "" }, 1);
        MiniTest.assertThat(argumentExists).isEqualTo(false);
    }

    @TestMe
    public void argumentExistsAndPositionIsGreaterThanItsLength() {
        Interactable interactable = new Interactable();
        boolean argumentExists = interactable.argumentExists(new String[] { "", "" }, 1);
        MiniTest.assertThat(argumentExists).isEqualTo(true);
    }

    @TestMe
    public void getArgumentThrowsExceptionIfArgumentIsNull() {
        Interactable interactable = new Interactable();
        String exceptionMessage = null;
        try {
            interactable.getArgument(null, 0, null);
        } catch (Exception exception) {
            exceptionMessage = exception.getMessage();
        }

        MiniTest.assertThat(exceptionMessage).isEqualTo("Can't get null argument.");
    }

    public static void main(String[] args) {
        InteractableTest interactableTest = new InteractableTest();
        interactableTest.runClassTests();
    }
}