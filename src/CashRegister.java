/**
 * GD
 * 17-8-2021
 *
 * Production Release 2.00
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

    public String subtractContent(double content) {
        if (content > this.content) {
            return "Not enough money in CashRegister to withdraw";
        }

        if (content <=0) {
            return "Amount of money to withdraw had to be more than 0.00";
        }
        this.content -= content;
        return "";
    }

    public void addContent(double content) {
        this.content += content;
    }
}
