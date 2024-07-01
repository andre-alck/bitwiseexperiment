import java.io.File;

public class Interactable {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        Permission permission = Permission.getPermission(args[1]);

        PermissionService permissionService = new PermissionService();
        boolean isAllowed = permissionService.isAllowed(value, permission);

        Interactable interactable = new Interactable();
        interactable.check(isAllowed);
    }

    public void check(boolean isAllowed) {
        String name;
        if(isAllowed) {
            name = "firedrill.png";
        } else {
            name = "nogodplsno.jpg";
        }

        this.openImage(name);
    }

    private void openImage(String name) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("eog", name);
            processBuilder.directory(new File("/home/asac/Downloads"));
            processBuilder.start();
        } catch (Exception e) {
            this.handleException(e);
        }
    }

    private void handleException(Exception e) {
        System.out.println(e.getMessage());
    }

    // TODO impl tests library and make Interactable reusable for other bitwise use cases
}
