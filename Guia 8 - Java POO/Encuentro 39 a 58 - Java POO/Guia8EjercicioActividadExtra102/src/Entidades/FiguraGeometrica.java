/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
° Cuadrado
° Rectángulo
° Triangulo
° Circulo
° Hexágono
° Pentágono
° Rombo
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla.
@author JimeM
 */
package Entidades;

public class FiguraGeometrica {
    
    private String tipo;
    private Double perimetro;
    private Double area;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String tipo, Double perimetro, Double area) {
        this.tipo = tipo;
        this.perimetro = perimetro;
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipo=" + tipo + ", perimetro=" + perimetro + ", area=" + area + '}';
    }
    
}
