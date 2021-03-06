package com.company;
/* Class Name: TaxableProduct
 * Description: Super class of all the taxable product category
 * Inheritance: TaxableProduct extends Product
 */
abstract class TaxableProduct extends Product {
    private static final double SALES_TAX_RATE = 0.1;

    /* Constructor Name: TaxableProduct
     * Description: call its super constructor
     * Parameter: product information
     * Return Type: None
     */
    TaxableProduct(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }

    /* Method Name: getSalesTaxRate
     * Description: return sales tax rate of 10%
     * Parameter: None
     * Return Type: constant double
     */
    double getSalesTaxRate() {
        return SALES_TAX_RATE;
    }

}
