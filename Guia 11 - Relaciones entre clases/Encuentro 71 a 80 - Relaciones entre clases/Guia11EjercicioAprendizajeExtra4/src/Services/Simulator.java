/*
Desarrollar un simulador del sistema de votación de facilitadores en Egg-cooperation:
° El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos: Nombre completo, DNI y 
cantidad de votos. Además, crearemos una clase Simulador que va a tener los métodos para manejar los alumnos y sus 
votaciones. Estos métodos serán llamados desde el main.
° La clase Simulador debe tener un método que genere un listado de alumnos manera aleatoria y lo retorne. 
Las combinaciones de nombre y apellido deben ser generadas de manera aleatoria. Nota: usar listas de tipo String para 
generar los nombres y los apellidos.
° Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un rango real de números de 
documentos. Y agregar a los alumnos su DNI. Este método debe retornar la lista de dnis.
° Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de objetos Alumno, elegidos por el 
usuario, y le asigne los nombres y los dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos con el 
mismo dni, pero si con el mismo nombre.
° Se debe imprimir por pantalla el listado de alumnos.
° Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos, un objeto Alumno que será el 
alumno que vota y una lista de los alumnos a los que votó.
° Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y para cada alumno genera tres 
votos de manera aleatoria. En este método debemos guardar a el alumno que vota, a los alumnos a los que votó y sumarle 
uno a la cantidad de votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno. Tener en cuenta que 
un alumno no puede votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar un hashset para resolver esto.
° Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales fueron sus 3 votos.
° Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y comienza a hacer el recuento 
de votos.
° Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5 facilitadores suplentes con los 
5 segundos alumnos más votados. A continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.
@author JimeM
 */
package Services;

import Entity.Student;
import Entity.Vote;
import Utility.StudentComparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Simulator {

    private List<String> names;
    private List<String> lastnames;

    public Simulator() {
        this.names = new ArrayList();
        this.lastnames = new ArrayList();
        loadData();
    }

    private void loadData() {
        String values = "Alejandro Alberto Andrés Antonio Carlos David Diego Eduardo Fernando Francisco Gabriel Guillermo Héctor Ignacio Iván Javier Jorge José Juan Luis Manuel Marcos Miguel Pablo Pedro Rafael Roberto Santiago Sebastián Tomás Vicente Alejandra Ana Andrea Antonia Beatriz Camila Carolina Catalina Claudia Daniela Diana Elena Erika Gabriela Isabel Irene Jacqueline Jessica Jimena Laura Lucía María Mariana Marta Natalia Nicole Patricia Paula Pilar Renata Sofía Valeria Victoria";
        this.names.addAll(Arrays.asList(values.split(" ")));
        values = "Acuña Aguilar Alcántara Alonso Álvarez Anaya Aparicio Aranda Arenas Ávila Ayala Baeza Báez Ballesteros Barragán Bautista Beltrán Bernal Blanco Bolaños Bonilla Borja Calderón Camacho Campos Cano Cárdenas Carranza Carrera Castillo Castro Centeno Cerda Chávez Cisneros Colmenares Contreras Cortés Crespo Cruz Cuevas Delgado Díaz Domínguez Escobar Espinosa Estrada Fernández Flores Fonseca Franco García Garza Gómez González Guerrero Gutiérrez Guzmán Hernández Herrera Ibarra Ibáñez Jiménez Lara Limón López Martínez Martínez Matthies Medina Meléndez Méndez Mendoza Mercado Molina Morales Moreno Muñoz Narváez Navarro Núñez Olvera Ortega Ortiz Oviedo Páez Paredes Pérez Pérez Pizarro Ponce Ramírez Ramos Rangel Reyes Rivera Rodríguez Romero Ruiz Sánchez Sánchez Sandoval Santos Saucedo Serrano Silva Soto Suárez Tapia Torres Treviño Valdez Valencia Varela Vázquez Velázquez Vidal Villa Villanueva Villegas Villarreal Yáñez";
        this.lastnames.addAll(Arrays.asList(values.split(" ")));
    }
    
    private String randomNumber(List<String> list) {
        return list.get((int) (Math.random() * list.size()));
    }

    public List<String> generateNames(int amount) {
        List<String> rosterNames = new ArrayList();
        for (int i = 0; i < amount; i++) {
            rosterNames.add(randomNumber(this.names) + " " + randomNumber(this.lastnames));
        }
        return rosterNames;
    }

    public List<String> generateSSN(int amount) {
        Set<String> rosterSSN = new HashSet();
        do {
            String value = String.valueOf((int) (Math.random() * 89999999) + 10000000);
            rosterSSN.add(value);
        } while (rosterSSN.size() < amount);
        return rosterSSN.stream().collect(Collectors.toList());
    }

    public List<Student> generateStudents(int amount, List<String> names, List<String> ssn) {
        List<Student> roster = new ArrayList();
        for (int i = 0; i < amount; i++) {
            roster.add(new Student(randomNumber(names), ssn.get(i)));
        }
        return roster;
    }

    public void showStudents(List<Student> students) {
        System.out.println("---------------------------------");
        students.forEach(ss -> System.out.println(ss));
    }

    public List<Vote> voting(List<Student> students, Integer amount) {
        List<Vote> votes = new ArrayList();
        Set<Student> voted = new HashSet();
        for (Student ss : students) {
            voted.add(ss);
            do {
                voted.add(students.get((int) (Math.random() * students.size())));
            } while (voted.size() < amount + 1);
            voted.remove(ss);
            giveVote(voted);
            votes.add(new Vote(ss, voted.stream().collect(Collectors.toList())));
            voted.clear();
        }
        return votes;
    }

    private void giveVote(Set<Student> voted) {
        for (Student ss : voted) {
            ss.setAmountOfVotes(ss.getAmountOfVotes() + 1);
        }
    }

    public void showVotes(List<Vote> votes) {
        System.out.println("---------------------------------");
        votes.forEach(vv -> System.out.println(vv));
    }

    public void voteCount(List<Student> students, List<Vote> votes) {
        System.out.println("---------------------------------");
        int count = 0;
        for (Student ss : students) {
            count = 0;
            for (Vote vv : votes) {
                for (Student voted : vv.getVoted()) {
                    if (voted.equals(ss)) count++;
                }
            }
            if (ss.getAmountOfVotes()== count) {
                System.out.printf("Student %s, Votes: %d - Validated\n", ss.getSsn(), count);
            } else {
                System.out.printf("Student %s, Votes: %d  - Different record: %d\n", ss.getSsn(), count, ss.getAmountOfVotes());;
            }
        }
    }

    public void showFacilitadores(List<Student> students, Integer amount) {
        students.sort(StudentComparators.orderByVotesDesc);
        List<Student> facilitadores = students.subList(0, amount);
        List<Student> suplentes = students.subList(amount, 2 * amount);
        System.out.println("---------------------------------");
        System.out.println("Facilitators:");
        facilitadores.forEach(ss -> System.out.println(ss));
        System.out.println("---------------------------------");
        System.out.println("Substitutes:");
        suplentes.forEach(ss -> System.out.println(ss));
    }
}
