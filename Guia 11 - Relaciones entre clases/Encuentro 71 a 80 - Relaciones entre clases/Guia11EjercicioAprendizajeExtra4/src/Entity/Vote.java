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
package Entity;

import java.util.List;

public class Vote {
     
    private Student voter;
    private List<Student> poll;

    public Vote() {
    }

    public Vote(Student voter, List<Student> voted) {
        this.voter = voter;
        this.poll = voted;
    }

    public Student getVoter() {
        return voter;
    }

    public void setVoter(Student voter) {
        this.voter = voter;
    }

    public List<Student> getVoted() {
        return poll;
    }

    public void setVoted(List<Student> voted) {
        this.poll = voted;
    }

    @Override
    public String toString() {
        return "Vote{" + "voter=" + voter + ", voted=" + poll + '}';
    }

}
