package com.company;
/* Class Name: Book
 * Description: Product category book
 * Inheritance: Book extends abstract TaxFreeProduct class
 */
class Book extends TaxFreeProduct {
    /* Constructor Name: Book
     * Description: call super constructor to set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Book(int productQuantity, boolean isImported, String productName, double productPrice) {
        super(productQuantity, isImported, productName, productPrice);
    }

}
