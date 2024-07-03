public class Interactable {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        Permission permission = Permission.getPermission(args[1]);

        PermissionService permissionService = new PermissionService();
        boolean isAllowed = permissionService.isAllowed(value, permission);

        Interactable interactable = new Interactable();
        MiniTest.assertThat(isAllowed).isEqualTo(true);
    }

    // TODO make Interactable reusable for other bitwise use cases
}
