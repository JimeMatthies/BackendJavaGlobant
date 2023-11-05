/*
Guia 12 = Aplicacion Mascotas (Video 3)
@author JimeM
 */
package enums;

public enum CatBreeds {
    BOMBAY(201, "Bombay"), SCOTTISH_FOLD(202, "Scottish Fold"), RAGDOLL(203, "Ragdoll"), BIRMAN(204, "Birman"), BALINESE(205, "Balinese");

    private Integer code;
    private String value;

    private CatBreeds(Integer code, String value) {
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