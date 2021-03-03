package ge.btu.vano.skhirtladze.currency;


public class Converter {
    private String to;
    private int amount;

    public Converter() {

    }

    public Converter(String to, int amount) {
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "to='" + to + '\'' +
                ", amount=" + amount +
                '}';
    }


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
