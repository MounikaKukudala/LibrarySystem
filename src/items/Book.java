package items;

import java.util.Date;

public class Book extends LibraryItem {
    private String Author;
    private Date PublishedDate;

    public Book(String title, String identifier, int price, String author, Date publishedDate) {
        super(title, identifier, price);
        Author = author;
        PublishedDate = publishedDate;
    }
    public String getAuthor() {
        return Author;
    }

    public Date getPublishedDate() {
        return PublishedDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPublishedDate(Date publishedDate) {
        PublishedDate = publishedDate;
    }

    @Override
    public int calculateLateFee(int days) {
        return 10*days;
    }
}
