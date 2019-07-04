package com.company;
/* Class Name: Medical
 * Description: Product category medical
 * Inheritance: Medical extends abstract TaxFreeProduct class
 */
class Medical extends TaxFreeProduct {
    /* Constructor Name: Medical
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Medical(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
}
