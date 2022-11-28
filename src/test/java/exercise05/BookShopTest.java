package exercise05;

import org.junit.Test;

import exercise05.BookShop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookShopTest {

    /**
     * La classe BookShop stampa la ricevuta relativa all'acquisto di
     * alcuni libri. Dovrebbe riconoscere uno sconto del 20% all'acquisto del
     * terzo libro. Purtroppo non sembra funzionare benissimo nel caso di tre
     * libri.
     *
     * Riesci a usare i test per capire perché?
     */
    @Test
    public void oneBook() {
        BookShop shop = new BookShop();

        shop.buy("Harry Potter and the Half-Blood Prince");

        assertEquals("Harry Potter and the Half-Blood Prince: 10.00 EUR\n" +
                        "\n" +
                        "TOTAL: 10.0 EUR",
                shop.getReceipt());

    }

    @Test
    public void twoBooks() {
        BookShop shop = new BookShop();

        shop.buy("Harry Potter and the Half-Blood Prince");
        shop.buy("Harry Potter and the Sorcerer's Stone");

        assertEquals("Harry Potter and the Half-Blood Prince: 10.00 EUR\n" +
                        "Harry Potter and the Sorcerer's Stone: 10.00 EUR\n" +
                        "\n" +
                        "TOTAL: 20.0 EUR",
                shop.getReceipt());

    }

    @Test
    public void threeBooks() {
        BookShop shop = new BookShop();

        shop.buy("Harry Potter and the Half-Blood Prince");
        shop.buy("Harry Potter and the Sorcerer's Stone");
        shop.buy("Harry Potter and the Chamber of Secrets");

        assertEquals("Harry Potter and the Half-Blood Prince: 10.00 EUR\n" +
                        "Harry Potter and the Sorcerer's Stone: 10.00 EUR\n" +
                        "Harry Potter and the Chamber of Secrets: 10.00 EUR\n" +
                        "\n" +
                        "TOTAL: 30.0 EUR",
                shop.getReceipt());

    }

}
