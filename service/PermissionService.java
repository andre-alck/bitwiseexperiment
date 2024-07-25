public class PermissionService {
    public boolean isAllowed(int value, Permission permission) {
        int permissionValue = permission.getValue();
        return (value & permissionValue) == permissionValue;
    }
}