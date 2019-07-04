package com.company;
import java.util.ArrayList;
/* Class Name: Main
 * Description: Entry point of the program
 * Inheritance: None
 */
public class Main {
    public static void main(String[] args) throws Exception{
        // TODO: change filename to actual input argument

        // Parse input and add items to shopping basket
        InputParser parser = new InputParser("input3.txt");
        ArrayList<Product> shoppingBasket = parser.parseInputFile();

        // If shopping basket is not empty, create receipt for the shoppingBasket and print
        if(!shoppingBasket.isEmpty()) {
            Receipt receipt = new Receipt(shoppingBasket);
            receipt.printReceipt();
        }
    }
}
