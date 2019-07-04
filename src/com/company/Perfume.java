package com.company;
/* Class Name: Perfume
 * Description: Product category perfume
 * Inheritance: Perfume extends abstract TaxableProduct class
 */
class Perfume extends TaxableProduct {
    /* Constructor Name: Perfume
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Perfume(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
}
