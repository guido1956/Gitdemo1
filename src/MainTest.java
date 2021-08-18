public class MainTest {

    public void check(String testname, double expected, double actual, String message) {
        if (expected == actual) {
            System.out.println("OK!     " + testname);
        } else {
            System.out.println("NOT OK! " + testname + " ***" + message + "***");
        }
    }
}
