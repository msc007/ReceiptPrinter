package com.company;

public class Book extends TaxFreeProduct{
    public Book(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }

    public String getName(){
        return super.productName;
    }
}
