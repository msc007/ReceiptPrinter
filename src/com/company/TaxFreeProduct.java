package com.company;

public abstract class TaxFreeProduct extends Product {
    public static final double SALES_TAX_RATE = 0.0;
    public TaxFreeProduct(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }
    public abstract String getName();
    public double getSalesTaxRate() {
        return SALES_TAX_RATE;
    }
}
