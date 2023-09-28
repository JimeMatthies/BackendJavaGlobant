/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package guia10repositorio2;

import Entity.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10Repositorio2 {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        
        //Create a students List.
        ArrayList<Student> students = new ArrayList(); 

        //Fill students List
        String answer = "";
        do {
            Student s1 = new Student(); //Create a new student every loop to add it to our students list.
            System.out.println("Student's document: "); //We ask for the student information.
            int document = SC.nextInt();
            System.out.println("Students's name: ");
            String name = SC.next();
            System.out.println("Grade 1: ");
            int grade1 = SC.nextInt();
            System.out.println("Grade 2: ");
            int grade2 = SC.nextInt();
            s1.setDocument(document); //We set student's information
            s1.setName(name);
            s1.setGrade1(grade1);
            s1.setGrade2(grade2);
            students.add(s1); //Add the student with information to the list
            System.out.println("Do you want to add another student? (Y/N)");
            answer = SC.next();
        } while (answer.equalsIgnoreCase("y"));
        System.out.println("---------------------------------");
        students.forEach((ss) -> System.out.println(ss));//Show students.

        //Sort students List
        System.out.println("---------------------------------");
        System.out.println("Sort by Document (Ascending)");
        students.sort(Student.orderByDocumentAsc); //Sort through comparator
        students.forEach((ss) -> System.out.println(ss));//Show students.

        //Show student's final grade by asking
        System.out.println("---------------------------------");
        System.out.println("Which student wants to calculate their final grade?"); 
        String studentNameGrade = SC.next();  
        for (Student ss : students) { //We loop the list  
            if (ss.getName().equalsIgnoreCase(studentNameGrade)) { //Validate if student exist
                System.out.println(studentNameGrade + " final grade is " + ss.finalGrade()); 
            }
        }

        //Remove a student
        System.out.println("---------------------------------");
        Iterator<Student> it = students.iterator();
        boolean removed = false; //Use boolean to show whether the student was removed or not.
        System.out.println("Which student do you want to remove?");
        String studentNameRemove = SC.next();

        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(studentNameRemove)) {
                it.remove();
                removed = true;
            }
        }
        if (removed) {
            System.out.println("---------------------------------");
            students.forEach((ss) -> System.out.println(ss));//Show students.
        } else {
            System.out.println("---------------------------------");
            System.out.println("The student is not on the list");
        }
    }
}
