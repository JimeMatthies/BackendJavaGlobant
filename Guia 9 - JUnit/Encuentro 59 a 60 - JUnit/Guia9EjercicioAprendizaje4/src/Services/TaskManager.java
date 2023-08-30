/*
Gestor de Tareas:
Crea una clase Task que permita agregar, eliminar y listar tareas.
Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
@author JimeM
 */
package Services;

import Entity.Task;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Task> tasks = new ArrayList<>();

    public Task createTaskManager() {
        System.out.println("---------------------------------");
        System.out.println("Name:");
        String name = SC.next();
        System.out.println("Description:");
        String description = SC.next();

        return new Task(name, description);
    }

    public void showTaskManager(Task tm) {
        System.out.println("---------------------------------");
        System.out.println("TaskManager information: ");
        System.out.println("Name: " + tm.getName());
        System.out.println("Description: " + tm.getDescription());
    }
    
        
    public void addTask(Task tt) {
        tasks.add(tt);
    }

    public void deleteTask(Task tt) {
        tasks.remove(tt);
    }

    public ArrayList <Task> ArrayListTasks() {
        return tasks;
    }
}
