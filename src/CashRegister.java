import java.util.ArrayList;

/**
 * GD
 * 17-8-2021
 * Version 1
 * Production Release 1.0
 */

public class CashRegister {
    private double content;
    private ArrayList<Loggin> logs;

    public CashRegister() {
         content = 0.00;
         logging("new cashregister", content);
    }

    public CashRegister(double content) {
        this.content = content;
        logging("new cahregister", content);
    }

    public double getContent() {
        return content;
    }

    private void logging(String log, double value) {
        logs.add(new Loggin(log, value));

    }

    private void toonLogging() {
        for (Loggin e : logs) {
            System.out.println(e.getLogging() + " " + e.getValue());
        }
    }
}




