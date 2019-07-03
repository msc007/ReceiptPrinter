package com.company;
import java.util.ArrayList;

class Receipt  {
    private ArrayList<Product> shoppingBasket;
    /* Constructor Name: Receipt
     * Description: Set shoppingBasket parsed from input file
     * Parameter: ArrayList<Product>
     * Return Type: None
     */
    Receipt(ArrayList<Product> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }
    /* Method Name: calculateSalesTax
     * Description:
     * Parameter: Product object
     * Return Type: double
     */
    private double calculateSalesTax(Product product) {
        return Math.ceil(20 * (product.productPrice * product.getSalesTaxRate()))/20.0;
    }
    /* Method Name: calculateImportedTax
     * Description:
     * Parameter: Product
     * Return Type: double
     */
    private double calculateImportedTax(Product product) {
        return Math.ceil(20 * (product.productPrice * product.getImportedTaxRate()))/20.0;
    }
    /* Method Name: getProductPriceWithTaxes
     * Description:
     * Parameter: Product
     * Return Type: double
     */
    private double getProductPriceWithTaxes(Product product) {
        double priceWithTaxes = product.productPrice + calculateSalesTax(product);
        if(product.isImported)
            priceWithTaxes += calculateImportedTax(product);
        return priceWithTaxes;
    }
    /* Method Name: calculateTotalSalesTaxes
     * Description:
     * Parameter: None
     * Return Type: double
     */
    private double calculateTotalSalesTaxes() {
        double totalSalesTax = 0.0;
        for(Product product : shoppingBasket) {
            totalSalesTax += calculateSalesTax(product);
            if(product.isImported)
                totalSalesTax += calculateImportedTax(product);
        }
        return totalSalesTax;
    }
    /* Method Name: calculateTotal
     * Description:
     * Parameter: None
     * Return Type: double
     */
    private double calculateTotal() {
        double total = 0;
        for (Product product : shoppingBasket) {
            total += getProductPriceWithTaxes(product);
        }
        return total;
    }
    /* Method Name: printReceipt
     * Description:
     * Parameter: None
     * Return Type: double
     */
    void printReceipt() {
        StringBuilder output = new StringBuilder();
        for (Product product : shoppingBasket) {
            output.append(String.format("%d %s%s: %.2f\n",product.productQuantity, product.isImported? "imported ": "",
                                                      product.productName, getProductPriceWithTaxes(product)));
        }
        output.append( String.format("Sales Taxes: %.2f\n", calculateTotalSalesTaxes()));
        output.append(String.format("Total: %.2f", calculateTotal()));
        System.out.println(output);
    }

}
