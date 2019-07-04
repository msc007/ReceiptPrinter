package com.company;
/* Class Name: Food
 * Description: Product category food
 * Inheritance: Food extends abstract TaxFreeProduct class
 */
class Food extends TaxFreeProduct {
    /* Constructor Name: Food
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Food(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }
}
