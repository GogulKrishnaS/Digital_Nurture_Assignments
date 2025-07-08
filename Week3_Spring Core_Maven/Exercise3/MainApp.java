import com.example.client.NotificationManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        NotificationManager manager =
                context.getBean("notificationManager", NotificationManager.class);

        manager.process("Hello, Gogul!");
    }
}
