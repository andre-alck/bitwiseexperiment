import java.lang.Integer;
import java.lang.Boolean;

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

    public static void main(String[] args) {
        InteractableTest interactableTest = new InteractableTest();
        interactableTest.runClassTests();
    }
}