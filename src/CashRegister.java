import java.util.ArrayList;

/**
 * GD
 * 17-8-2021
 * Production Release 3.0
 */

public class CashRegister {
    private double content;
    private ArrayList<Loggin> logs;

    public CashRegister() {
         content = 0.00;
         logging("new cashregister", content);
    }

    public CashRegister(double content) {
        if (content < 0.00) {
            content = 0.00;
        }
        this.content = content;
        logging("new cahregister", content);
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        logging("wisselen cassette. Oude casette: ", this.content);
        logging("wisselen cassette. Nieuwe cassette: " , content);
        this.content = content;
    }

    private void logging(String log, double value) {
        logs.add(new Loggin(log, value));

    }

    private void showLogs() {
        for (Loggin e : logs) {
            System.out.println(e.getLogging() + " " + e.getValue());
        }
    }
}




