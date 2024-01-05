import items.Book;
import items.CD;
import items.LibraryItem;
import main.CalculateLateFee;
import main.LibrarySystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        LibraryItem book1 = new Book("Ikigai","id1",600,"Hector", new Date(2000,01,01));
        LibraryItem cd1 = new CD("CompactSong","id2",300, 20, 3.3);
        librarySystem.addItem(book1);
        librarySystem.addItem(cd1);

        int totalValue = librarySystem.calculateTotalValue();
        int lateFees = librarySystem.calculateTotalLateFees(new CalculateLateFee[]{(CalculateLateFee) book1}, 3);
        System.out.println(totalValue);
        System.out.println(lateFees);
    }
}