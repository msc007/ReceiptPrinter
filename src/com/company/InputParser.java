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
            // TODO: there may be better way.
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

            // Add product to shopping basket
            shoppingBasket.add(product);
        }
        return shoppingBasket;
    }
}
