package exercise05;

import java.util.Locale;

public class BookShop {
    private final double DISCOUNT_EVERY_THREE_BOOKS = 20 / 100;
    private final Book[] availableBooks = new Book[]{
            new Book("Harry Potter and the Half-Blood Prince", 10.00),
            new Book("Harry Potter and the Chamber of Secrets", 10.00),
            new Book("Harry Potter and the Sorcerer's Stone", 10.00),
            new Book("Harry Potter and the Goblet of Fire", 10.00),
            new Book("Harry Potter and the Order of the Phoenix", 10.00)
    };

    public BookShop() {
        this.orderTotal = 0.0;
        this.totalBooks = 0;
        this.itemsList = "";
    }

    private String itemsList;
    private double orderTotal;
    private int totalBooks;

    public void buy(String title) {
        double price = 0;
        itemsList += "" + title;
        for (int i = 0; i < availableBooks.length; i++) {
            if (title.equals(this.availableBooks[i].getTitle())) {
                price = availableBooks[i].getFullPrice();
            }
        }
        String priceStr = String.format(Locale.US, "%2.2f", price);
        itemsList += String.format(": %s EUR\n", priceStr);
        orderTotal += price;
        totalBooks++;
        if (totalBooks > 3) {
            orderTotal = orderTotal - price + price * DISCOUNT_EVERY_THREE_BOOKS;
        }
    }

    private double getTotal() {
        return orderTotal;
    }

    public String getReceipt() {
        return String.format("%s\n%s", getItemsList(), totalLine());
    }

    public String getItemsList() {
        return itemsList;
    }

    public String totalLine() {
        return String.format(Locale.US, "TOTAL: %s EUR", getTotal());
    }

}
