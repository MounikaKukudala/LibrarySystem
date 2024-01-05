package items;

import main.CalculateLateFee;

public abstract class LibraryItem implements CalculateLateFee {
    private String title;
    private String identifier;

    private int price;

    public LibraryItem(String title, String identifier,int price) {
        this.title = title;
        this.identifier = identifier;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
