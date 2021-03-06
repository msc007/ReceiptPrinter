package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Class Name: InputParse
 * Description: Take input text file and read each lines and extract necessary values
 */
class InputParser {
    private static final String DIRECTORY = "C:\\Users\\Min\\IdeaProjects\\ReceiptPrinter\\in\\";
    private static final String REGEX = "(\\d)(\\s)(\\bimported\\b\\s)*(.*?)(\\bat\\b)(\\s)(\\d+\\.\\d+)";
    private String fullPath;
    private ArrayList<Product> shoppingBasket;

    InputParser(String filename){
        this.fullPath = DIRECTORY + filename;
        this.shoppingBasket = new ArrayList<>();
    }

    ArrayList<Product> parseInputFile() throws Exception {
        // Pass the path to the file as a parameter
        File file = new File(fullPath);
        Scanner sc = new Scanner(file);

        // Initialize variables
        int productQuantity = 0;
        boolean isImported = false;
        String productName = "";
        double productPrice = 0.0;
        ProductFactory productFactory = new ProductFactory();
        Product product;

        // Read each line from input text
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(line);

            // Set extracted values to each variables
            while (m.find()) {
                productQuantity = Integer.parseInt(m.group(1));
                isImported = m.group(3) != null;
                productName = m.group(4).trim();
                productPrice = Double.parseDouble(m.group(7));
            }

            // Send values to productFactory to create product
            product = productFactory.createProduct(productQuantity, isImported, productName, productPrice);
            // Add created product to shoppingBasket for precessing receipt
            shoppingBasket.add(product);
        }
        return shoppingBasket;
    }
}
