package LecturePractice.Day_0813.example02;


public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
}