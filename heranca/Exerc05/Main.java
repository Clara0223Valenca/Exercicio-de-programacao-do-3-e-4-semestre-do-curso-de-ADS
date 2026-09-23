package Exerc05;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        PaymentCard paymentItauCard =  new PaymentCard(100, "1234567987654321");

        paymentItauCard.processPayment();

        PaymentCard paymentVisaCard =  new PaymentCard(100, "4654321");

        paymentVisaCard.processPayment();

        //---------------------------------------------\\

        PaymentSlip paymentSlip1 = new PaymentSlip(300, "1233746302");

        paymentSlip1.processPayment();
        
    }
}
