package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
        // TODO: change filename to actual input argument

        // Parse input and add items to shopping basket
        InputParser parser = new InputParser("input3.txt");
        ArrayList<Product> shoppingBasket = parser.parseInputFile();
        // Create receipt for the shoppingBasket and print
        Receipt receipt = new Receipt(shoppingBasket);
        receipt.print();
    }
}
