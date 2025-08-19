package LecturePractice.Day_0813.example03;

public class BusinessUser extends User {
    private String companyName;

    public BusinessUser(String userId, String name, String companyName) {
        super(userId, name);
        this.companyName = companyName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("회사명: " + companyName);
    }
}
