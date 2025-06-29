public class UserService {

    public String getUserRole(String username) {
        if (username == null || username.isEmpty()) {
            return "GUEST";
        } else if (username.equalsIgnoreCase("admin")) {
            return "ADMIN";
        } else {
            return "USER";
        }
    }

    public int calculateAge(int birthYear) {
        return 2025 - birthYear;
    }

    public boolean isActiveUser(String username) {
        return username != null && !username.isBlank();
    }
}
