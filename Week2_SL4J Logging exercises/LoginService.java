import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService {

    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    public boolean login(String username, String password) {
        logger.info("Login attempt for user: {}", username);

        if (username == null || password == null) {
            logger.warn("Username or password is null");
            return false;
        }

        if (username.isBlank() || password.isBlank()) {
            logger.warn("Username or password is blank");
            return false;
        }

        if (!"admin".equals(username) || !"password123".equals(password)) {
            logger.error("Invalid login for user: {}", username);
            return false;
        }

        logger.info("Login successful for user: {}", username);
        return true;
    }

    public static void main(String[] args) {
        LoginService service = new LoginService();
        service.login(null, "password123");               
        service.login("admin", "wrongpass");            
        service.login("admin", "password123");            
    }
}
