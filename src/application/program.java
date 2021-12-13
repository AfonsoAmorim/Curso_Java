package application;

import entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantify in stock: ");
        product.quantify = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in: ");
        int quantify = sc.nextInt();
        product.addProducts(quantify);

        System.out.println();
        System.out.print("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed stock: ");
        quantify = sc.nextInt();
        product.removeProducts(quantify);

        System.out.println();
        System.out.println("Update data: " + product);






    }

}
