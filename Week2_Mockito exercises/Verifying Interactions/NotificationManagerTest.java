import static org.mockito.Mockito.*;

class NotificationManagerTest {

    @Test
    void testSendEmailCalledOnce() {
        EmailService mockEmailService = mock(EmailService.class);
        NotificationManager manager = new NotificationManager(mockEmailService);

        manager.notifyUser("test@example.com", "Welcome!");

        verify(mockEmailService, times(1))
                .sendEmail("test@example.com", "Welcome!");
    }

    @Test
    void testSendEmailNotCalledForBlankUser() {
        EmailService mockEmailService = mock(EmailService.class);
        NotificationManager manager = new NotificationManager(mockEmailService);

        manager.notifyUser(" ", "Hello");
        manager.notifyUser(null, "Hi");

        verify(mockEmailService, never()).sendEmail(anyString(), anyString());
    }
}
