package ch.heigvd.res.chill.domain.jlheig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MalandrinTest {

  @Test
  void thePriceAndNameForMalandrinShouldBeCorrect() {
    Malandrin beer = new Malandrin();
    assertEquals(beer.getName(), Malandrin.NAME);
    assertEquals(beer.getPrice(), Malandrin.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMalandrin() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jlheig.Malandrin";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Malandrin.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}