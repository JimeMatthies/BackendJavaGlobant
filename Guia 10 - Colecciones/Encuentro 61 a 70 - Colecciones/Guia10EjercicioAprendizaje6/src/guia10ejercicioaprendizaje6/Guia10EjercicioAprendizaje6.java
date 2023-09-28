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
package guia10ejercicioaprendizaje6;

import Services.ProductService;
import java.util.Scanner;

public class Guia10EjercicioAprendizaje6 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        ProductService ps = new ProductService();
        ps.createProducts();
        ps.showProducts();
        ps.editProduct();
        ps.showProducts();
        System.out.println("Wich product do you want to remove?");
        String productName = SC.next();
        ps.searchRemoveProduct(productName.toUpperCase());
        ps.showProducts();
    }

}
