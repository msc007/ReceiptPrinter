package com.company;
import java.util.ArrayList;
/* Class Name: Receipt
 * Description: Process receipt and Print receipt
 * Inheritance: None
 */
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
     * Description: calculate sales tax of 1 product
     * Parameter: Product object
     * Return Type: double
     */
    private double calculateSalesTax(Product product) {
        return Math.ceil(20 * (product.getProductPrice() * product.getSalesTaxRate()))/20.0;
    }
    /* Method Name: calculateImportedTax
     * Description: calculate imported tax of 1 product
     * Parameter: Product
     * Return Type: double
     */
    private double calculateImportedTax(Product product) {
        return Math.ceil(20 * (product.getProductPrice() * product.getImportedTaxRate()))/20.0;
    }
    /* Method Name: getProductPriceWithTaxes
     * Description:
     * Parameter: Product
     * Return Type: double
     */
    private double calculateProductPriceWithTaxes(Product product) {
        double priceWithTaxes = product.getProductPrice() + calculateSalesTax(product);
        if(product.getIsImported())
            priceWithTaxes += calculateImportedTax(product);
        return product.getProductQuantity() * priceWithTaxes;
    }
    /* Method Name: calculateTotalSalesTaxes
     * Description:
     * Parameter: None
     * Return Type: double
     */
    private double calculateTotalSalesTaxes() {
        double totalSalesTax = 0.0;
        for(Product product : shoppingBasket) {
            totalSalesTax += (calculateSalesTax(product) * product.getProductQuantity());
            if(product.getIsImported())
                totalSalesTax += (calculateImportedTax(product) * product.getProductQuantity());
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
            total += calculateProductPriceWithTaxes(product);
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
            output.append(String.format("%d %s%s: %.2f\n",
                                        product.getProductQuantity(), product.getIsImported()? "imported " : "",
                                        product.getProductName(), calculateProductPriceWithTaxes(product)));
        }
        output.append( String.format("Sales Taxes: %.2f\n", calculateTotalSalesTaxes()));
        output.append(String.format("Total: %.2f", calculateTotal()));
        System.out.println(output);
    }

}
