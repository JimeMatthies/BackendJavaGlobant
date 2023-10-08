/*
Guia 11 = Aplicación Mascotas Relaciones (Videos 1, 6, 7, 8)
@author JimeM
 */
package Enum;

public enum DogBreeds {
    COCKER_SPANIEL(101, "Cocker Spaniel"), LABRADOR(102, "Labrador"), PITBULL(103, "Pitbull"), CHIHUAHUA(104, "Chihuahua"), HUSKY(105, "Husky");
    
    private Integer code;
    private String value;

    private DogBreeds(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
