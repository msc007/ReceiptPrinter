package com.company;

public abstract class Product {
    private static final double IMPORTED_TAX_RATE = 0.05;
    int productQuantity;
    boolean isImported;
    String productName;
    double productPrice;

    Product(int productQuantity, boolean isImported, String productName, double productPrice){
        this.productQuantity = productQuantity;
        this.isImported = isImported;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public abstract String getName();

    double getImportedTaxRate(){
        return IMPORTED_TAX_RATE;
    }

    public abstract double getSalesTaxRate();

}
