/*
Gestor de Tareas:
Crea una clase Task que permita agregar, eliminar y listar tareas.
Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
@author JimeM
 */
package Entity;

public class Task {

    private String name;
    private String description;

    public Task() {
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + '}';
    }

}
