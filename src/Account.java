public class Account {
    public static void main(String[] args) {
        AccountExample account = new AccountExample();

        String account1 = "123abc_";
        String account2 = "_abc123";
        String account3 = "______";
        String account4 = "123456";
        String account5 = "abcdefg";
        String account6 = ".@";
        String account7 = "12345";
        String account8 = "1234_";
        String account9 = "abcde";

        System.out.println(account.validate(account1));
        System.out.println(account.validate(account2));
        System.out.println(account.validate(account3));
        System.out.println(account.validate(account4));
        System.out.println(account.validate(account5));
        System.out.println(account.validate(account6));
        System.out.println(account.validate(account7));
        System.out.println(account.validate(account8));
        System.out.println(account.validate(account9));
    }

}
