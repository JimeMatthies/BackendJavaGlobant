/*
Gestor de Tareas:
Crea una clase Task que permita agregar, eliminar y listar tareas.
Escribe pruebas unitarias para verificar que el gestor de tareas realiza las operaciones
correctamente, como agregar una tarea, eliminar una tarea existente y listar las tareas disponibles.
@author JimeM
 */

import Entity.Task;
import Services.TaskManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaskManagerTest {

    TaskManager tm;

    public TaskManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tm = new TaskManager();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addTaskTest() {
        System.out.println("---------------------------------");
        System.out.println("Add Task Test");
        int size = tm.ArrayListTasks().size();
        Task task = new Task("Tarea 01", "Detalle");
        tm.addTask(task);
        assertEquals(size + 1, tm.ArrayListTasks().size());
        assertTrue(tm.ArrayListTasks().contains(task));
    }

    @Test
    public void deleteTaskTest() {
        System.out.println("---------------------------------");
        System.out.println("Delete Task Test");
        Task task = new Task("Tarea 02", "Detalle");
        tm.addTask(task);
        int size = tm.ArrayListTasks().size();
        tm.deleteTask(task);
        assertEquals(size - 1, tm.ArrayListTasks().size());
        assertFalse(tm.ArrayListTasks().contains(task));
    }

    @Test
    public void ArrayListTasksTest() {
        System.out.println("---------------------------------");
        System.out.println("ArrayList Tasks Test");
        assertNotNull(tm.ArrayListTasks());
    }
}
