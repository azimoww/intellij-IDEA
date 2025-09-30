package SetExamples;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {


        HashSet<String> cities = new HashSet<>();
        cities.add("Baku");
        cities.add("London");
        cities.add("Paris");
        cities.add("Berlin");
        cities.add("Rome");
        boolean added = cities.add("Baku");
        System.out.println("HashSet: " + cities);
        System.out.println("Попытка добавить дубликат (Baku): " + added);

        System.out.println();


        LinkedHashSet<String> linkedCities = new LinkedHashSet<>();
        linkedCities.add("Baku");
        linkedCities.add("London");
        linkedCities.add("Paris");
        linkedCities.add("Berlin");
        linkedCities.add("Rome");
        System.out.println("LinkedHashSet (порядок сохранён): " + linkedCities);

        System.out.println();


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(15);
        numbers.add(3);
        numbers.add(20);
        numbers.add(8);
        numbers.add(1);
        System.out.println("TreeSet (отсортировано): " + numbers);

        System.out.println();


        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("NavigableSet: " + set);
        System.out.println("higher(20): " + set.higher(20));
        System.out.println("floor(25): " + set.floor(25));
        System.out.println("descendingSet(): " + set.descendingSet());
    }
}


