/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione la información 
sobre las personas vinculadas con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores 
y personal de servicio. A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación 
y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la facultad 
y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen 
(lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados 
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A continuación, 
debe programar las clases definidas en las que, además de los constructores, hay que desarrollar los métodos 
correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba que instancie 
objetos de los distintos tipos y pruebe los métodos desarrollados.
@author JimeM
 */
package services;

import entities.Employee;
import entities.Person;
import entities.Professor;
import entities.Staff;
import entities.Student;
import enums.CivilStatus;
import java.util.List;
import java.util.Scanner;

public class PersonService {

    private Scanner SC;

    public PersonService() {
        this.SC = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void showFaculty(List<Person> people){
        for (Person pp : people) {
            System.out.println(pp.toString());
        }
    }

    public void changeCivilState(Person pp) {
        System.out.println("Current civil status: " + pp.getCivilStatus());
        System.out.println("Select new civil status:");
        int i = 1;
        for (CivilStatus cs : CivilStatus.values()) {
            System.out.println("" + i + " - " + cs);
            i++;
        }
        int op = SC.nextInt();
        pp.setCivilStatus(CivilStatus.values()[op - 1]);
    }

    public void changeOffice(Employee ee) {
        System.out.println("Current Office: " + ee.getOfficeNumber());
        System.out.println("Enter new office number:");
        ee.setOfficeNumber(SC.nextInt());
    }

    public void changeClass(Student ss) {
        System.out.println("Current class: " + ss.getClassName());
        System.out.println("Enter new class name:");
        ss.setClassName(SC.next());
    }

    public void changeDepartament(Professor pf) {
        System.out.println("Current departament: " + pf.getDepartament());
        System.out.println("Enter new departament:");
        pf.setDepartament(SC.next());
    }

    public void changeSection(Staff sf) {
        System.out.println("Current departament: " + sf.getSection());
        System.out.println("Enter new section:");
        sf.setSection(SC.next());
    }
}
