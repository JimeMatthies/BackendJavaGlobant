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
package Services;

import Entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Student> students;

    public StudentService() {
        this.students = new ArrayList();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student createStudent() {
        System.out.println("---------------------------------");
        System.out.println("Student's name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("Student's lastname:");
        String lastname = SC.next();
        lastname = lastname.toUpperCase();
        System.out.println("Student's grades:");
        ArrayList<Integer> grades = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades.add(SC.nextInt());
        }
        return new Student(name, lastname, grades);
    }

    public void addStudent(Student ss) {
        students.add(ss);
    }

    public void showStudent(Student ss) {
        System.out.println("---------------------------------");
        System.out.println("Student's information: ");
        System.out.println("Name: " + ss.getName());
        System.out.println("Lastname: " + ss.getLastname());
        System.out.println("Grades: ");
        for (Integer gg : ss.getGrades()) {
            System.out.println(gg);
        }
    }

    public void showStudents() {
        System.out.println("---------------------------------");
        System.out.println("Students from List:");
        for (Student ss : students) {
            System.out.println(ss.toString());
        }
        System.out.println("Number of students = " + students.size());
    }

    public Integer finalGrade(String studentLastname) {
        ArrayList<Integer> studentGrades = null;
        for (Student ss : students) {
            if (ss.getLastname().equals(studentLastname)) {
                studentGrades = new ArrayList(ss.getGrades());
            }
        }
        Integer finalGrade = 0;
        for (Integer grade : studentGrades) {
            finalGrade += grade;
        }
        return finalGrade / studentGrades.size();
    }

}
