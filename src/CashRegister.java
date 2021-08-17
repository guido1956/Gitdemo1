/**
 * GD
 * 17-8-2021
 * Version 2
 * Predicted Production Release 2.0
 *
 */

public class CashRegister {
    private double content;

    public CashRegister() {
        content = 0.00;
    }

    public CashRegister(double content) {
        this.content = content;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
}
