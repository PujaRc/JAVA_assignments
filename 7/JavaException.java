public class JavaException {
    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        } else
            System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        JavaException obj = new JavaException();
        obj.checkAge(13);
        System.out.println("End of program");
    }
}