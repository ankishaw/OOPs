class Notification{
    public void sendNotification(){
        System.out.println("Notification Sent");
    }
}
class EmailNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification sent");
    }
}
class TextNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Text Notification sent");
    }
}
public class LSP {
    public static void main(String[] args){
        Notification notification = new EmailNotification();
        Notification notification1 = new TextNotification();

        notification.sendNotification();
        notification1.sendNotification();

    }
}
