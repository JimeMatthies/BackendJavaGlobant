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
package Services;

public class MatrixCalculator {

    public int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {
        //Check if both matrix are the same size.
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            return null;
        }
        int[][] matrixResult = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixResult[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] subtractMatrix(int[][] matrixA, int[][] matrixB) {
        //Check if both matrix are the same size.
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            return null;
        }
        int[][] matrixResult = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixResult[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
        //Check if columns in Matrix A are the same size as rows in MatrixB
        if (matrixA[0].length != matrixB.length) {
            return null;
        }
        int[][] matrixResult = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    matrixResult[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixResult;
    }

    public void getCofactor(int matrix[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        // Looping for each element of the matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Copying into temporary matrix only those element which are not in given row and column
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];
                    // Row is filled, so increase row index and reset col index
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public int determinantOfMatrix(int matrix[][], int n) {
        int D = 0;
        // Base case: if matrix contains single element
        if (n == 1) {
            return matrix[0][0];
        }
        // To store cofactors
        int temp[][] = new int[n][n];
        // To store sign multiplier
        int sign = 1;
        // Iterate for each element of first row
        for (int f = 0; f < n; f++) {
            // Getting Cofactor of matrix[0][f]
            getCofactor(matrix, temp, 0, f, n);
            D += sign * matrix[0][f] * determinantOfMatrix(temp, n - 1);
            // terms are to be added with alternate sign
            sign = -sign;
        }
        return D;
    }

    public int[][] transposeMatrix(int[][] matrix) {
        int[][] matrixResult = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixResult[i][j] = matrix[j][i];
            }
        }
        return matrixResult;
    }

    public void adjoint(int[][] matrix, int[][] adj) {
        int n = matrix.length;
        if (n == 1) {
            adj[0][0] = 1;
            return;
        }
        int sign = 1;
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                getCofactor(matrix, temp, i, j, n);
                sign = ((i + j) % 2 == 0) ? 1 : -1;
                adj[j][i] = (sign) * (determinantOfMatrix(temp, n - 1));
            }
        }
    }

    public boolean inverse(int matrix[][], float[][] inverse) {
        int n = matrix.length;
        int D = determinantOfMatrix(matrix, n);
        if (D == 0) {
            System.out.println("Singular matrix, can't find its inverse");
            return false;
        }
        int[][] adj = new int[n][n];
        adjoint(matrix, adj);
        // Find Inverse using formula "inverse(A) = adj(A)/det(A)"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adj[i][j] / (float) D;
            }
        }
        return true;
    }

    public void print2D(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("");
    }

    public void print2D(float matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                    System.out.printf("%.4f ", matrix[i][j]);
                } else {
                    System.out.printf("%.4f ", matrix[i][j]);
                }
            }
            System.out.println("]");
        }
        System.out.println("");
    }

}
