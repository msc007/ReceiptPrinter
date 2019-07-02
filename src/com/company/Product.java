package com.company;

import java.util.HashSet;

public abstract class Product {
    /*
    public static HashSet<String> taxFreeProductList = new HashSet<String>();
    static {
        taxFreeProductList.add("chocolate bar");
        taxFreeProductList.add("box of chocolate");
        taxFreeProductList.add("bottle of perfume");
        taxFreeProductList.add("packet of headache pills");
    }*/
    public static final double IMPORTED_TAX_RATE = 0.05;
    int productQuantity;
    boolean isImported;
    String productName;
    double productPrice;

    public Product(int productQuantity, boolean isImported, String productName, double productPrice){
        this.productQuantity = productQuantity;
        this.isImported = isImported;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public abstract String getName();

    public double getImportedTaxRate(){
        return IMPORTED_TAX_RATE;
    }

    public abstract double getSalesTaxRate();

}
