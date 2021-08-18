public class TestUS003 extends MainTest {

    public static void main(String[] args) {
        TestUS003 test = new TestUS003();
        test.test_EmptyConstructorAmoutIsZero();
        test.test_NotEmptyConstructorAmountIsStartAmount();
    }

    public  void test_EmptyConstructorAmoutIsZero() {
        CashRegister cashRegister = new CashRegister();
        String testname = "Empty constructor results in amount of zero";
        String message = "amount is not zero";
        double expectedResult = 0.00;
        double actualResult = cashRegister.getContent();
        check(testname, expectedResult,actualResult, message );
    }

    public  void test_NotEmptyConstructorAmountIsStartAmount() {
        CashRegister cashRegister = new CashRegister(200.00);
        String testname = "New cashregister contains start amount";
        String message = "amount is not equal to start amount ";
        double expectedResult = 200.00;
        double actualResult = cashRegister.getContent();
        check(testname, expectedResult,actualResult, message );
    }
}
