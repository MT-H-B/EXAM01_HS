package BankInfo;

public class BankTest {
    public static void main(String[] args) {
        System.out.println("========== 계좌 개설 ==========");
        BankClass woori = new BankClass("우리은행", 100000);
        BankClass kb = new BankClass("국민은행", 200000);

        System.out.println(woori.getName() + " : " + woori.getBalance());
        System.out.println(kb.getName() + " : " + kb.getBalance());

        System.out.println("========== 송금 ==========");
        long amount = woori.withdrawal(50000);
        kb.deposit((int)amount);
        System.out.println(woori.getName() + " : " + woori.getBalance());
        System.out.println(kb.getName() + " : " + kb.getBalance());

        System.out.println("========== 출금 ==========");
        long wooriAmount = woori.withdrawal(200000);
        System.out.println(woori.getName() + "에서 출금한 금액 : " + wooriAmount);
        System.out.println(woori.getName() + " : " + woori.getBalance());
    }
}
