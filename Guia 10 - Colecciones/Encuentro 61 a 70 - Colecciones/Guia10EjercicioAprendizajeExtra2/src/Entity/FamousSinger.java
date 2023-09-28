/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
@author JimeM
 */
package Entity;

import java.util.Objects;

public class FamousSinger {
    
    private String name;
    private String bestSellingAlbum;

    public FamousSinger() {
    }

    public FamousSinger(String name, String bestSellingAlbum) {
        this.name = name;
        this.bestSellingAlbum = bestSellingAlbum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBestSellingAlbum() {
        return bestSellingAlbum;
    }

    public void setBestSellingAlbum(String bestSellingAlbum) {
        this.bestSellingAlbum = bestSellingAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.bestSellingAlbum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FamousSinger other = (FamousSinger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.bestSellingAlbum, other.bestSellingAlbum)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "FamousSinger{" + "name=" + name + ", bestSellingAlbum=" + bestSellingAlbum + '}';
    }

}
