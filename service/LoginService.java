import java.util.HashMap;

public class LoginService {
    private HashMap<String, Integer> users = new HashMap<>();
    public static final String USER_IS_NOT_PRESENT_EXCEPTION_MESSAGE = "User is not present.";

    public LoginService() {
        users.put("andre.carvalho", 12345);
        users.put("monica.amorzinho", 67890);
    }

    public boolean login(String user, Integer password) {
        if (!this.isUserPresent(user)) {
            throw new RuntimeException(LoginService.USER_IS_NOT_PRESENT_EXCEPTION_MESSAGE);
        }

        if (password == null) {
            return false;
        }

        return (this.users.get(user) ^ password) == 0;
    }

    public boolean isUserPresent(String user) {
        if (user == null || user.length() < 1) {
            return false;
        }

        boolean isUserPresent = false;
        for (String key : users.keySet()) {
            if (key.equalsIgnoreCase(user)) {
                isUserPresent = true;
                break;
            }
        }

        return isUserPresent;
    }
}