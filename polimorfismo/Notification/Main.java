package Notification;

public class Main {
    
    public static void main(String[] args) {
        
        Notification sms1 = new NotificationSMS();
        Notification email1 = new NotificationEmail();

        sms1.send("Este é um sms");
        email1.send("Venho através deste email comunicar...Atenciosamente");

    }
}
