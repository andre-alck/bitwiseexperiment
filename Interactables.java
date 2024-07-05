import java.lang.Integer;
import java.lang.Boolean;

public class Interactables extends Interactable {
    public static void main(String[] args) {
        Interactables Interactables = new Interactables();
        Integer intValue = (Integer) Interactables.getArgument(args, 0, Integer.class);
        Boolean value = (Boolean) Interactables.getArgument(args, 1, Boolean.class);
    }
}