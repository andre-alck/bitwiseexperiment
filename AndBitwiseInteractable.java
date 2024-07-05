import java.lang.Integer;
import java.lang.Boolean;

public class AndBitwiseInteractable extends Interactable {
    public static void main(String[] args) {
        AndBitwiseInteractable interactable = new AndBitwiseInteractable();

        Integer value = (Integer) interactable.getArgument(args, 0, Integer.class);
        Permission permission = Permission.getPermission((String) interactable.getArgument(args, 1, String.class));

        PermissionService permissionService = new PermissionService();
        boolean isAllowed = permissionService.isAllowed(value, permission);

        MiniTest.assertThat(isAllowed).isEqualTo(true);
    }
}