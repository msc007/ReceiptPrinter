package com.company;

public class Medical extends TaxFreeProduct{
    public Medical(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
    public String getName(){
        return super.productName;
    }
}
