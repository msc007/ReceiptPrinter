package com.company;

public class Food extends TaxFreeProduct{
    public Food(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }
    public String getName(){
        return super.productName;
    }
}
