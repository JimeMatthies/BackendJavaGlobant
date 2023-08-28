/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
° Un constructor por defecto.
° Un constructor con todos los atributos como parámetro.
° Métodos getters y setters de cada atributo.
° método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
° Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
° Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
@author JimeM
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        System.out.println("---------------------------------");
        System.out.println("Nombre del curso:");
        String nombreCurso = SC.next();
        System.out.println("Cantidad de horas por día:");
        int cantidadHorasPorDia = SC.nextInt();
        System.out.println("Cantidad días por semana:");
        int cantidadDiasPorSemana = SC.nextInt();
        System.out.println("Turno del curso: (mañana o tarde)");
        String turno = SC.next();
        System.out.println("Precio por hora:");
        double precioPorHora = SC.nextDouble();
        System.out.println("Alumnos");
        String[] alumnos = cargarAlumnos();

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }

    public void mostrarCurso(Curso cc) {
        System.out.println("---------------------------------");
        System.out.println("Información del curso: ");
        System.out.println("Nombre del curso: " + cc.getNombreCurso());
        System.out.println("Cantidad horas por día: " + cc.getCantidadHorasPorDia());
        System.out.println("Cantidad días por semana: " + cc.getCantidadDiasPorSemana());
        System.out.println("Turno: " + cc.getTurno());
        System.out.println("Precio por hora: " + cc.getPrecioPorHora());
        System.out.println("Alumnos: ");
        String[] alumnos = cc.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print((i+1) + "° alumno: ");
            System.out.println(alumnos[i]);
        }
    }

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre del " + (i + 1) + "° alumno: ");
            alumnos[i] = SC.next();
        }
        return alumnos;
    }

    public void calcularGananciaSemanal(Curso cc) {
        double profits = cc.getCantidadHorasPorDia() * cc.getPrecioPorHora()
                * cc.getAlumnos().length * cc.getCantidadDiasPorSemana();
        System.out.println("Ganancias totales: " + profits);
    }

}
