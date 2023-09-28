/*
Guia 10 = Aplicación Mascotas Conjuntos (Videos 1 - 8)
@author JimeM
 */
package guia10ejerciciovideos;

import Entity.Pet;
import Services.PetService;
import Utilities.PetComparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Guia10EjercicioVideos {

    public static void main(String[] args) {

        collectionNotes();
        PetService ps = new PetService();
        ps.puppyFactory(140);
        ps.petsFactory(2);
        ps.showPets();
        ps.updatePet(0);
        ps.showPets();
        ps.removePet(0);
        ps.showPets();

    }

    public static void collectionNotes() {

        // Arrays (Unidirectional or Vector)
        System.out.println("---------------------------------");
        String[] namesArray = new String[5];
        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = "Chiquito " + (i + 1) + "°";
        }
        for (String name : namesArray) {
            System.out.println(name);
        }
        // Colections (List - ArrayList)
        System.out.println("---------------------------------");
        ArrayList<String> namesArrayList = new ArrayList();
        namesArrayList.add("Chiquito A");
        namesArrayList.add("Chiquito B");
        namesArrayList.add("Chiquito C");
        System.out.println(namesArrayList);
        System.out.println("Array's size: " + namesArrayList.size());//3
        namesArrayList.remove("Chiquito C");
        System.out.println(namesArrayList);
        System.out.println("Array's size: " + namesArrayList.size());//2

        //ArrayList max ArrayList dimension
        System.out.println("---------------------------------");
        System.out.println(Integer.MAX_VALUE);//2147483647

        //ArrayList Functions
        //1.- "asList" Create List from Array.
        System.out.println("---------------------------------");
        ArrayList<String> namesArrayList2 = new ArrayList(Arrays.asList(namesArray));
        System.out.println(namesArrayList2);
        //2.- "addAll" Appends elements of a List to another.
        System.out.println("---------------------------------");
        namesArrayList.addAll(0, namesArrayList2);//Index 0 to add new list at the beginning.
        System.out.println(namesArrayList);
        //3.- "isEmpty" Checks whether a String is empty or not.
        System.out.println("---------------------------------");
        System.out.println("¿El Array esta vacío? = " + namesArrayList.isEmpty());
        //4.- "containsAll" Check if List contains another List.
        System.out.println("---------------------------------");
        System.out.println("¿El Array contiene al Array 2? = " + namesArrayList.containsAll(namesArrayList2));
        //5.- "lastIndexOf" Get the index of the last occurrence of an element in an ArrayList.
        System.out.println("---------------------------------");
        System.out.println(namesArrayList.lastIndexOf("Chiquito A"));

        //Loops
        System.out.println("---------------------------------");
        ArrayList<String> namesArrayList3 = new ArrayList();
        namesArrayList3.add("Nala");
        namesArrayList3.add("Coca");
        namesArrayList3.add("Milky");
        //By Element (Can't remove elements)
        for (String name : namesArrayList3) {
            System.out.println(name);
        }
        //Var i (Can remove elements using .size())
        System.out.println("---------------------------------");
        for (int i = 0; i < namesArrayList3.size(); i++) {
            System.out.println(namesArrayList3.get(i));
        }
        //Iterator it (Can remove elements)
        Iterator<String> it = namesArrayList3.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Milky")) {
                it.remove();
            }
        }
        //For each
        System.out.println("---------------------------------");
        namesArrayList3.forEach((e) -> System.out.println(e));
        //Stream
        System.out.println("---------------------------------");
        System.out.println(namesArrayList3.stream().count());

        //Matrix
        ArrayList<ArrayList<Integer>> Matrix = new ArrayList();

        //Comparator
        System.out.println("---------------------------------");
        ArrayList<Pet> PetsExample = new ArrayList();
        PetsExample.add(new Pet("Nala Matthies Veliz", "Nala", "Dog", "Cocker Spaniel", "Gold", 13, false));
        PetsExample.add(new Pet("Coca Cola Sanchez Cooper", "Coca", "Dog", "Labrador", "Black", 11, true));
        PetsExample.add(new Pet("Maria Milkrecia de las Mercedez Mattel Matthies", "Milky Way", "Dog", "Labrador", "Black", 1, true));
        PetsExample.forEach((e) -> System.out.println(e));
        System.out.println("---------------------------------");
        Collections.sort(PetsExample, PetComparators.orderByNameDesc);
        PetsExample.forEach((e) -> System.out.println(e));
        System.out.println("---------------------------------");
        Collections.shuffle(PetsExample);
        PetsExample.forEach((e) -> System.out.println(e));
        
        //Set
        System.out.println("---------------------------------");
        HashSet<String> namesSet = new HashSet();
        namesSet.add("Nala");
        namesSet.add("Nala");
        namesSet.add("Nala");
        namesSet.forEach((e) -> System.out.println(e));
        
        //HashSet (Equals & HashCode)
        System.out.println("---------------------------------");
        Set<Pet> pets1Set = new HashSet();
        pets1Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets1Set.forEach((e) -> System.out.println(e));
        
        //TreeSet (implements comparable)
        System.out.println("---------------------------------");
        Set<Pet> pets2Set = new TreeSet();
        pets2Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.add(new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.add(new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        pets2Set.forEach((e) -> System.out.println(e));
        
        //Maps
        System.out.println("---------------------------------");
        HashMap<Integer, String> studentsMap = new HashMap();
        studentsMap.put(1, "Jimena");
        studentsMap.put(2, "Rosa");
        studentsMap.put(3, "Maria");
        for (Map.Entry<Integer, String> student : studentsMap.entrySet()) {
            Integer key = student.getKey();
            String value = student.getValue();
            System.out.println("Key: " + key + " -> Value: " + value);
        }
        
        //Maps with Object
        System.out.println("---------------------------------");
        HashMap<String, Pet> petsMap = new HashMap();
        petsMap.put("001", new Pet("Fer", "Chiquito", "Dog", "Chihuahua", "Gold", 1, true));
        petsMap.put("002", new Pet("Pepa", "Lola", "Dog", "Chihuahua", "Gold", 1, true));
        //petsMap.remove("001");
        for (Map.Entry<String, Pet> pet : petsMap.entrySet()) {
            String key = pet.getKey();
            Pet value = pet.getValue();
            System.out.println("Key: " + key + " -> Value: " + value);
        }
    }
}
