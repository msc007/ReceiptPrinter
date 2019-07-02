package com.company;

public class Perfume extends TaxableProduct{
    public Perfume(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }
    public String getName(){
        return super.productName;
    }
}
