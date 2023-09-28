/*
Guia 10 = Repositorio Colecciones (Curso, Listas, Sets, Mapas)
@author JimeM
 */
package Entity;

import java.util.Comparator;

public class Student {

    private Integer document;
    private String name;
    private Integer grade1;
    private Integer grade2;

    public Student() {
    }

    public Student(Integer document, String name, Integer grade1, Integer grade2) {
        this.document = document;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade1() {
        return grade1;
    }

    public void setGrade1(Integer grade1) {
        this.grade1 = grade1;
    }

    public Integer getGrade2() {
        return grade2;
    }

    public void setGrade2(Integer grade2) {
        this.grade2 = grade2;
    }

    public int finalGrade() {
        int finalGrade;
        finalGrade = (grade1 + grade2) / 2;
        return finalGrade;
    }

    public static Comparator<Student> orderByDocumentAsc = new Comparator<Student>() { //Create comparator 
        @Override //Use override to bring method from another class
        public int compare(Student e1, Student e2) { //Give two objects to compare
            return e1.getDocument().compareTo(e2.getDocument()); //Use getter to compare
            //(First then second to Asc, second then first to Desc)
        }
    };

    public static Comparator<Student> orderByNameAsc = new Comparator<Student>() { 
        @Override
        public int compare(Student e1, Student e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    @Override
    public String toString() {
        return "Student{" + "document=" + document + ", name=" + name + ", grade1=" + grade1 + ", grade2=" + grade2 + '}';
    }

}
