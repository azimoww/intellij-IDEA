package SetExamples;
import java.util.*;

public class SetsAndMapsExample {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Baku");
        cities.add("London");
        cities.add("Paris");
        cities.add("Berlin");
        cities.add("Rome");
        boolean added = cities.add("Baku");
        System.out.println("HashSet: " + cities);
        System.out.println("Попытка добавить дубликат: " + added);


        LinkedHashSet<String> linkedCities = new LinkedHashSet<>();
        linkedCities.add("Baku");
        linkedCities.add("London");
        linkedCities.add("Paris");
        linkedCities.add("Berlin");
        linkedCities.add("Rome");
        System.out.println("LinkedHashSet (порядок сохраняется): " + linkedCities);


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);
        System.out.println("TreeSet (отсортировано): " + numbers);

        NavigableSet<Integer> navSet = new TreeSet<>(numbers);
        System.out.println("NavigableSet: " + navSet);
        System.out.println("higher(30): " + navSet.higher(30));
        System.out.println("floor(25): " + navSet.floor(25));
        System.out.println("descendingSet: " + navSet.descendingSet());


        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Ali", 90);
        grades.put("Nigar", 85);
        grades.put("Murad", 70);
        System.out.println("HashMap (оценки студентов): " + grades);

        
        grades.put("Ali", 95);
        System.out.println("После обновления: " + grades);

        LinkedHashMap<String, Integer> linkedGrades = new LinkedHashMap<>();
        linkedGrades.put("Ali", 90);
        linkedGrades.put("Nigar", 85);
        linkedGrades.put("Murad", 70);
        System.out.println("LinkedHashMap (порядок добавления): " + linkedGrades);


        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(3, "Ali");
        students.put(1, "Nigar");
        students.put(2, "Murad");
        System.out.println("TreeMap (отсортированные ключи): " + students);

        System.out.println("firstEntry: " + students.firstEntry());
        System.out.println("lastEntry: " + students.lastEntry());
        System.out.println("higherEntry(1): " + students.higherEntry(1));
    }
}

