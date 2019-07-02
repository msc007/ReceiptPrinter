package com.company;

import java.util.ArrayList;

public class Receipt  {
    private ArrayList<Product> shoppingBasket;

    public Receipt(ArrayList<Product> shoppingBasket){
        System.out.println(shoppingBasket);
        this.shoppingBasket = shoppingBasket;
    }
    public double getProductPriceWithTaxes(Product product){
        double priceWithTaxes = product.productPrice + product.productPrice * product.getSalesTaxRate();
        if(product.isImported)
            priceWithTaxes += product.productPrice * product.getImportedTaxRate()/100;
        return priceWithTaxes;
    }
    public double calculateTotalSalesTaxes(){
            double totalSalesTax = 0.0;


        return totalSalesTax;
    }
    public double calculateTotal(){
        int total = 0;
        for (Product product : shoppingBasket) {
            total += getProductPriceWithTaxes(product);
        }
        return total;
    }

    public void print(){
        String output = "";
        for (Product product : shoppingBasket) {
            output += String.format("%d %s%s: %.2f\n",product.productQuantity, product.isImported? "imported ": "", product.productName, getProductPriceWithTaxes(product));

        }
        output += "Sales Taxes: " + calculateTotalSalesTaxes() + "\n";
        output += "Total: " + calculateTotal();

        System.out.println(output);
    }

}
