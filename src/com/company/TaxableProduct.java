package com.company;

public abstract class TaxableProduct extends Product {
    public static final double SALES_TAX_RATE = 0.1;
    public TaxableProduct(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }
    public abstract String getName();
    public double getSalesTaxRate() {
        return SALES_TAX_RATE;
    }

}
