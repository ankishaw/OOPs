interface NotificationService{
    void send(String message);
}

class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println(" Email Sent "+message);
    }
}

class UserService{
    private final NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void register(String user){
        System.out.println("User Registered: " +user);
        notificationService.send("Welcome " +user);
    }
}

public class DI {

    public static void main(String[] args){
        System.out.println("Hello Java");
        NotificationService service = new EmailNotificationService();
        UserService userService = new UserService(service);
        userService.register("Ankit");
    }
}
