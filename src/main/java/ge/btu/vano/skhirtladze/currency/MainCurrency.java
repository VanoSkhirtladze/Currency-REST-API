package ge.btu.vano.skhirtladze.currency;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static ge.btu.vano.skhirtladze.currency.CurrencyInfo.getCurrencies;

@Path("/currency")
public class MainCurrency {


    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> currencies(){
        return getCurrencies();


    }

    @POST
    @Path("/buy")
    @Produces(MediaType.APPLICATION_JSON)
    public double buy(Converter converter) {
        double result = 0;
        for (Currency currency : currencies()) {
            if (currency.getTitle().equals(converter.getTo())) {
                result = converter.getAmount() * currency.getSell();
            }
        }
        return result;
    }


    @POST
    @Path("/sell")
    @Produces(MediaType.APPLICATION_JSON)
    public double sell (Converter converter){
        double result = 0;
        for (Currency currency : currencies()){
            if (currency.getTitle().equals(converter.getTo())){
                result = converter.getAmount() * currency.getBuy();
            }
        }
        return result;


        }









}
