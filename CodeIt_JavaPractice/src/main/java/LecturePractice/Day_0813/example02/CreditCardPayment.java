package LecturePractice.Day_0813.example02;

public class CreditCardPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
}