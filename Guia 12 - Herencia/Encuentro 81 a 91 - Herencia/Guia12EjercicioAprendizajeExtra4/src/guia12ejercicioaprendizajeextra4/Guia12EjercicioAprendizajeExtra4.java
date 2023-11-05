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
package guia12ejercicioaprendizajeextra4;

import entities.Person;
import entities.Professor;
import entities.Staff;
import entities.Student;
import enums.CivilStatus;
import java.util.ArrayList;
import java.util.List;
import services.PersonService;

public class Guia12EjercicioAprendizajeExtra4 {

    public static void main(String[] args) {

        List<Person> faculty = new ArrayList();
        Student ss1 = new Student("Math", "Jime", "Matthies", "16624798-5", CivilStatus.SINGLE);
        Professor pf1 = new Professor("Math", 2012, 1, "Carlos", "Jimenez", "77697435-7", CivilStatus.MARRIED);
        Staff sf1 = new Staff("1st Floor", 2006, 1, "Andrea", "Sanchez", "13496852-6", CivilStatus.DIVORCE);

        faculty.add(ss1);
        faculty.add(pf1);
        faculty.add(sf1);

        PersonService ps = new PersonService();
        System.out.println("---------------------------------");
        ps.showFaculty(faculty);
        ps.changeCivilState(pf1);
        ps.changeOffice(sf1);
        ps.changeClass(ss1);
        ps.changeDepartament(pf1);
        ps.changeSection(sf1);
        System.out.println("---------------------------------");
        ps.showFaculty(faculty);

    }

}
