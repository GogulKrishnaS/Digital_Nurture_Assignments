public class NotificationManager {

    private final EmailService emailService;

    public NotificationManager(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(String userEmail, String message) {
        if (userEmail != null && !userEmail.isBlank()) {
            emailService.sendEmail(userEmail, message);
        }
    }
}
