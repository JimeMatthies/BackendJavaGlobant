/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
@author JimeM
 */
package guia10ejercicioaprendizaje3;

import Entity.Student;
import Services.StudentService;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10EjercicioAprendizaje3 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        StudentService ss = new StudentService();

        String answer = "";
        do {
            ss.addStudent(ss.createStudent());
            System.out.println("Do you want to add another student? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        ss.showStudents();
        System.out.println("Enter the last name of the student you want to see fianl grade");
        String studentLastName = SC.next();
        studentLastName = studentLastName.toUpperCase();
        ArrayList<Student> students = new ArrayList(ss.getStudents());
        for (Student student : students) {
            if (student.getLastname().equals(studentLastName)) {
                ss.showStudent(student);
            }
        } 
        System.out.println(studentLastName + " final grade: " + ss.finalGrade(studentLastName));
    }

}
