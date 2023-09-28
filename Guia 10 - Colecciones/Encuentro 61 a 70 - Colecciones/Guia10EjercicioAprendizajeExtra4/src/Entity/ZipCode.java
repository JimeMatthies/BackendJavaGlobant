/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página: https://mapanet.eu/index.htm.
Nota: Poner el código postal sin la letra, solo el número.
° Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
° Muestra por pantalla los datos introducidos
° Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
° Muestra por pantalla los datos
° Agregar una ciudad con su código postal correspondiente más al HashMap.
° Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
° Muestra por pantalla los datos
@author JimeM
 */
package Entity;

import java.util.Objects;

public class ZipCode {
    
    private String city;
    private Integer code;

    public ZipCode() {
    }

    public ZipCode(String city, Integer code) {
        this.city = city.toUpperCase();
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.city);
        hash = 53 * hash + Objects.hashCode(this.code);
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
        final ZipCode other = (ZipCode) obj;
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ZipCode{" + "city=" + city + ", code=" + code + '}';
    }

}
