package com.company;
/* Class Name: ProductFactory
 * Description: Create product based on given input
 * Inheritance: None
 */
class ProductFactory {
    /* Method Name: createProduct
     * Description: Create product based on given input.
     *              Switch not used in order to create product based on its category, not by full name of product.
     *              i.e) "box of chocolates" is still a chocolate which should be consider as a Food.
     * Parameter: productQuantity, isImported, productName, productPrice
     * Return Type: Product
     */
    Product createProduct(int productQuantity, boolean isImported, String productName, double productPrice) {
        Product product = null;
        if(productName.contains("book"))
            product = new Book(productQuantity, isImported, productName, productPrice);
        else if(productName.contains("CD"))
            product = new CD(productQuantity, isImported, productName, productPrice);
        else if(productName.contains("chocolate"))
            product = new Food(productQuantity, isImported, productName, productPrice);
        else if(productName.contains("perfume"))
            product = new Perfume(productQuantity, isImported, productName, productPrice);
        else if(productName.contains("headache pills"))
            product = new Medical(productQuantity, isImported, productName, productPrice);
        else
            System.out.print("Product category not found!.");
        return product;
    }
}
