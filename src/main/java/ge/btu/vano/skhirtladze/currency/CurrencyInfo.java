package ge.btu.vano.skhirtladze.currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyInfo {

    public static List<Currency> getCurrencies() {
        List<Currency> currencies=new ArrayList<>();
        currencies.add(new Currency("USD",3.1600,3.2000));
        currencies.add(new Currency("EUR",3.4250,3.4750));
        currencies.add(new Currency("GBP",3.8400,3.9400));
        currencies.add(new Currency("RUB",4.1200,4.2500));
        currencies.add(new Currency("TRY",0.4000,0.4700));
        currencies.add(new Currency("AZN",1.6000,1.8400));

        return currencies;
    }



}
