package Notification;
/*2. (Sobrescrita) Desenvolva o módulo de comunicação de um sistema. Todos os tipos de envio compartilham uma base comum, mas se comportam de forma diferente na hora de disparar a mensagem. O que você deve codificar:
Crie uma classe base chamada Notificacao com um método público enviar(String mensagem). Esse método deve apenas imprimir "Enviando notificação genérica: [mensagem]".
Crie uma subclasse chamada NotificacaoSMS que herda de Notificacao. Modifique o comportamento do método enviar para que imprima "Enviando SMS: [mensagem]".
Crie outra subclasse chamada NotificacaoEmail que herda de Notificacao. Modifique o comportamento do método enviar para que imprima "Enviando E-mail com criptografia: [mensagem]".
08/06/2026*/

public class Notification {

    public void send(String message){

        System.out.println("Enviando notificação genérica: " + message);
    }
    
}
