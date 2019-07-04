package com.company;
/* Class Name: Product
 * Description: Base class for all product category
 * Inheritance: None
 */
public abstract class Product {
    private static final double IMPORTED_TAX_RATE = 0.05;
    private int productQuantity;
    private boolean isImported;
    private String productName;
    private double productPrice;

    /* Constructor Name: Book
     * Description: Set product field
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: None
     */
    Product(int productQuantity, boolean isImported, String productName, double productPrice) {
        this.productQuantity = productQuantity;
        this.isImported = isImported;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Getter Methods
    public int getProductQuantity() {
        return this.productQuantity;
    }
    public boolean getIsImported() {
        return this.isImported;
    }
    public String getProductName() {
        return this.productName;
    }
    public double getProductPrice() {
        return this.productPrice;
    }
    double getImportedTaxRate() {
        return IMPORTED_TAX_RATE;
    }

    // Abstract Methods
    abstract double getSalesTaxRate();

}
