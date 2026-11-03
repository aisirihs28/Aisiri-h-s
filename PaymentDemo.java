class Payment {
    double calculateAmount(double amount) {
        return amount;
    }

    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment {
    double calculateAmount(double amount) {
        return amount + (amount * 0.02);
    }
}

class UPIPayment extends Payment {
    double calculateAmount(double amount) {
        return amount + (amount * 0.005);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CardPayment();
        Payment p2 = new UPIPayment();

        System.out.println(
                "Card Payment: " + p1.calculateAmount(1000));

        System.out.println(
                "UPI Payment: " + p2.calculateAmount(1000));

        Payment p = new Payment();

        System.out.println(
                "Discount: " + p.calculateAmount(50000, 20));
    }
}
