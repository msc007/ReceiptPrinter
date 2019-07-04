package com.company;
/* Class Name: Product
 * Description: Base class for all product category
 * Inheritance: None
 */
public abstract class Product {
    private static final double IMPORTED_TAX_RATE = 0.05;
    int productQuantity;
    boolean isImported;
    String productName;
    double productPrice;

    /* Constructor Name: Book
     * Description: Set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Product(int productQuantity, boolean isImported, String productName, double productPrice){
        this.productQuantity = productQuantity;
        this.isImported = isImported;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //TODO: need all the getter/setter methods
    public abstract String getName();

    double getImportedTaxRate(){
        return IMPORTED_TAX_RATE;
    }

    public abstract double getSalesTaxRate();

}
