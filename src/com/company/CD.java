package com.company;
/* Class Name: CD
 * Description: Product category CD
 * Inheritance: CD extends abstract TaxableProduct class
 */
public class CD extends TaxableProduct {
    /* Constructor Name: CD
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    public CD(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
    public String getName(){
        return super.productName;
    }
}
