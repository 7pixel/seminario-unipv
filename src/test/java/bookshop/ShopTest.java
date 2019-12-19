package bookshop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ShopTest {
    @Test
    public void something() {
        BookShop shop = new BookShop();

        shop.buy("Harry Potter and the Half-Blood Prince");
        shop.buy("Harry Potter And The Sorcerer's Stone");
        shop.buy("Harry Potter and the Order of the Phoenix");
        shop.buy("Harry Potter And The Goblet Of Fire");

        assertEquals("Harry Potter and the Half-Blood Prince: 10.00 EUR\n" +
                "Harry Potter And The Sorcerer's Stone: 10.00 EUR\n" +
                "Harry Potter and the Order of the Phoenix: 10.00 EUR\n" +
                "Harry Potter And The Goblet Of Fire: 10.00 EUR\n",
                shop.getItemsList());

    }
}
