package ch.heigvd.res.chill.domain.sist1998;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Fanta implements IProduct {

    public final static String NAME = "Fanta";
    public final static BigDecimal PRICE = new BigDecimal(2.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
