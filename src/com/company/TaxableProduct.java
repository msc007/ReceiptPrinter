package com.company;

public abstract class TaxableProduct extends Product {
    private static final double SALES_TAX_RATE = 0.1;

    /* Constructor Name: TaxableProduct
     * Description: call its super constructor
     * Parameter: product information
     * Return Type: None
     */
    TaxableProduct(int productQuantity, boolean isImported, String productName, double productPrice){
        super(productQuantity, isImported, productName, productPrice);
    }

    /* Method Name: getSalesTaxRate
     * Description: return sales tax rate of 10%
     * Parameter: None
     * Return Type: constant double
     */
    public double getSalesTaxRate() {
        return SALES_TAX_RATE;
    }

}
