package ch.heigvd.res.chill.domain.noahfusi;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Grimbergen implements IProduct {

    public final static String NAME = "Grimbergen";
    public final static BigDecimal PRICE = new BigDecimal(4.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
