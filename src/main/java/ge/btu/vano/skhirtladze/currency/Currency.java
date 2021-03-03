package ge.btu.vano.skhirtladze.currency;

public class Currency {
    private String title;
    private double buy;
    private double sell;


    public Currency() {
    }

    public Currency(String title, double buy, double sell) {
        this.title = title;
        this.buy = buy;
        this.sell = sell;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

}
