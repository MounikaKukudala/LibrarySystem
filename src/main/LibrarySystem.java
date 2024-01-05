package main;

import items.LibraryItem;
import main.LateFeeCalculator;

import java.util.ArrayList;

public class LibrarySystem extends LateFeeCalculator {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public LibrarySystem(){
    }

    public LibrarySystem(ArrayList<LibraryItem> items){
        this.items = items;
    }

    public void addItem(LibraryItem item){
        this.items.add(item);
    }

    public void removeItem(LibraryItem item){
        this.items.remove(item);
    }

    public ArrayList<LibraryItem> checkoutItems(){
        return this.items;
    }

    public int calculateTotalValue(){
        int totalValue = 0;
        for(LibraryItem item: this.items){
            totalValue += item.getPrice();
        }
        return totalValue;
    }

}
