package com.company;
/* Class Name: TaxFreeProduct
 * Description: Super class of all the tax free product category
 * Inheritance: TaxFreeProduct extends Product
 */
public abstract class TaxFreeProduct extends Product {
    private static final double SALES_TAX_RATE = 0.0;

    /* Constructor Name: TaxFreeProduct
     * Description: call its super constructor
     * Parameter: product information
     * Return Type: None
     */
    TaxFreeProduct(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }

    /* Method Name: getSalesTaxRate
     * Description: return sales tax rate of 0%
     * Parameter: None
     * Return Type: constant double
     */
    public double getSalesTaxRate() {
        return SALES_TAX_RATE;
    }
}
