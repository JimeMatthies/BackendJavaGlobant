/*
Calculadora de Matrices
Crea una clase MatrixCalculator que realice operaciones matemáticas con matrices, como
suma, resta, multiplicación, determinante, inversa, etc.
Implementa correctamente los algoritmos necesarios para cada operación.
Escribe pruebas unitarias exhaustivas para cada operación matemática, verificando que los
resultados obtenidos sean correctos según las reglas matemáticas correspondientes.
Asegúrate de cubrir diferentes tamaños de matrices, matrices invertibles y no invertibles, y
situaciones especiales, como la multiplicación de matrices no compatibles.
También puedes incluir pruebas para comparar los tiempos de ejecución de las operaciones en
función del tamaño de las matrices.
@author JimeM
 */
package guia9desafioextra;

import Services.MatrixCalculator;

public class Guia9DesafioExtra {

    public static void main(String[] args) {

        MatrixCalculator mc = new MatrixCalculator();
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix A:");
        mc.print2D(A);
        //System.out.println(Arrays.deepToString(A)); To print matrix horizontal.
        int B[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix B:");
        mc.print2D(B);
        //System.out.println(Arrays.deepToString(B)); To print matrix horizontal.
        int C[][] = mc.sumMatrix(A, B);
        System.out.println("A + B:");
        mc.print2D(C);
        int D[][] = mc.subtractMatrix(A, B);
        System.out.println("A - B:");
        mc.print2D(D);
        int E[][] = mc.multiplyMatrix(A, B);
        System.out.println("A x B:");
        mc.print2D(E);
        int F = mc.determinantOfMatrix(A, 3);
        System.out.println("A Determinant:");
        System.out.println(F + "\n");
        int G[][] = mc.transposeMatrix(A);
        System.out.println("A Transpose");
        mc.print2D(G);
        int H[][] = {{5, -2, 2}, {1, 0, 3}, {-3, 1, 5}};
        System.out.println("Matrix H :");
        mc.print2D(H);
        int[][] adj = new int[H.length][H.length];
        System.out.println("The Adjoint is :");
        mc.adjoint(H, adj);
        mc.print2D(adj);
        float[][] inv = new float[H.length][H.length];
        System.out.println("The Inverse is :");
        if (mc.inverse(adj, inv)) {
            mc.print2D(inv);
        }
    }
}
