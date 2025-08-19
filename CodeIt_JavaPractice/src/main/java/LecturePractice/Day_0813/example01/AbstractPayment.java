package LecturePractice.Day_0813.example01;

public abstract class AbstractPayment {
    // 공통 검증 로직
    protected void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }

    // 공통 취소 검증 로직ㅊ
    protected void validateCancel(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }

    // 추상 메소드: 구체 클래스가 구현해야 함
    public abstract void pay(double amount);
    public abstract void cancel(double amount);
}