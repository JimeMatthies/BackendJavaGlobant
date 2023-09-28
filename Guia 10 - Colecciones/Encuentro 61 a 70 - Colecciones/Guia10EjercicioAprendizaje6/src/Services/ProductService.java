/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
@author JimeM
 */
package Services;

import Entity.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> products;

    public ProductService() {
        this.products = new HashMap();
    }

    public Product createProduct() {
        System.out.println("---------------------------------");
        System.out.println("Product's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Product's price:");
        Double price = SC.nextDouble();

        return new Product(name, price);
    }

    public void addProduct(Product pp) {
        products.put(pp.getName(), pp.getPrice());
    }

    public void createProducts() {
        String answer = "";
        do {
            addProduct(createProduct());
            System.out.println("Do you want to add another product? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    public void showProduct(Product pp) {
        System.out.println("---------------------------------");
        System.out.println("Product's information: ");
        System.out.println("Name: " + pp.getName());
        System.out.println("Price: " + pp.getPrice());
    }

    public void showProducts() {
        System.out.println("---------------------------------");
        System.out.println("Products from List:");
        for (Map.Entry<String, Double> pp : products.entrySet()) {
            String key = pp.getKey();
            Double value = pp.getValue();
            System.out.println("Name: " + key);
            System.out.println("Price: " + value);

        }
        System.out.println("Number of products = " + products.size());
    }

    public void editProduct() {
        System.out.println("Wich Product do you want to edit?");
        String productName = SC.next();
        productName = productName.toUpperCase();
        if (products.containsKey(productName)) {
            Double productPrice = products.get(productName);
            System.out.println(productPrice);
            System.out.println("Product " + productName + " found, Price: " + productPrice);
            System.out.println("Enter new price: ");
            Double newPrice = SC.nextDouble();
            if (!productPrice.equals(newPrice)) {
                products.put(productName, newPrice);
                System.out.println("Product updated");
            } else {
                System.out.println("Unable to update same price");
            }
        } else {
            System.out.println("Product " + productName + " is not on the list");
        }
    }

    public void searchRemoveProduct(String productName) {
        if (products.containsKey(productName)) {
            System.out.println("Are you sure you want to remove this product? (Y/N)");
            if (SC.next().equalsIgnoreCase("y")) {
                products.remove(productName);
                System.out.println("Product removed");
            }
        } else {
            System.out.println("Product " + productName + " is not on the list");
        }
    }

}
