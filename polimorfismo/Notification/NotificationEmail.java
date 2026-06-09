package Notification;
/*Crie outra subclasse chamada NotificacaoEmail que herda de Notificacao. Modifique o comportamento do método enviar para que imprima "Enviando E-mail com criptografia: [mensagem]" */

public class NotificationEmail extends Notification{
    
    @Override
    public void send(String message) {
        
        System.out.println("Enviando E-mail com criptografia: " + message);
    }
}
