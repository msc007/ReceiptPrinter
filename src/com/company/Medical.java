package com.company;
/* Class Name: Medical
 * Description: Product category medical
 * Inheritance: Medical extends abstract TaxFreeProduct class
 */
public class Medical extends TaxFreeProduct{
    /* Constructor Name: Medical
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    public Medical(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
    public String getName(){
        return super.productName;
    }
}
