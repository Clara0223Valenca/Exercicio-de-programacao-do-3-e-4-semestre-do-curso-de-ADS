package Notification;
/*
Crie uma subclasse chamada NotificacaoSMS que herda de Notificacao. Modifique o comportamento do método enviar para que imprima "Enviando SMS: [mensagem]"..
 */

public class NotificationSMS extends Notification{

    @Override
    public void send(String message) {
        
        System.out.println("Enviando SMS: " + message);
    }
   
    
}
