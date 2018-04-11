public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validateAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidateAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validateAccount) {
            boolean isvalidate = accountExample.validate(account);
            System.out.println("Account is" + account + "validate: " + isvalidate);
        }
        System.out.println();
        for (String account : invalidateAccount) {
            boolean isvalidate = accountExample.validate(account);
            System.out.println("Account is " + account + " invalidate: " + isvalidate);
        }
    }

}
