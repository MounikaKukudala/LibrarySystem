package main;

import main.CalculateLateFee;

public class LateFeeCalculator {
    public int calculateTotalLateFees(CalculateLateFee[] items, int days){
        int totalPrice = 0;
        for(CalculateLateFee item: items){
            totalPrice += item.calculateLateFee(days);
        }
        return totalPrice;
    }
}
