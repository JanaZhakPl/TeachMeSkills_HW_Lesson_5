package com.teachmeskills.lesson_5.Task0;

public class Runner {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard(123, 0);
        CreditCard mastercard = new CreditCard(345,100);
        CreditCard mir = new CreditCard(678, 200);

        visa.isIncreased(5000);
        mastercard.isIncreased(1);
        mir.isReduced(200);
        visa.cardInformation();
        mastercard.cardInformation();
        mir.cardInformation();



    }

}
