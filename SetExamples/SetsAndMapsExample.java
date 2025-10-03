import java.util.*;

 class SetAndMapsExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Ali", 15);
        students.put("Nigar", 16);
        students.put("Murad", 14);
        students.put("Ayan", 15);
        students.put("Samir", 16);

        System.out.println("Студенты: " + students);

        if (students.containsKey("Alice")) {
            System.out.println("Alice есть");
        } else {
            System.out.println("Alice нет");
        }

        students.remove("Murad");
        System.out.println("После удаления: " + students);


        LinkedHashMap<Integer, String> cities = new LinkedHashMap<>();
        cities.put(1, "Baku");
        cities.put(2, "London");
        cities.put(3, "Paris");
        cities.put(4, "Berlin");
        cities.put(5, "Rome");

        System.out.println("Города: " + cities);
        System.out.println("Только ключи: " + cities.keySet());
        System.out.println("Только значения: " + cities.values());


        TreeMap<Integer, String> phones = new TreeMap<>();
        phones.put(5551, "Ali");
        phones.put(5553, "Nigar");
        phones.put(5552, "Murad");
        phones.put(5555, "Ayan");
        phones.put(5554, "Samir");

        System.out.println("Телефоны (отсортировано): " + phones);
        System.out.println("firstEntry: " + phones.firstEntry());
        System.out.println("lastEntry: " + phones.lastEntry());
        System.out.println("higherEntry(5552): " + phones.higherEntry(5552));
        System.out.println("lowerEntry(5552): " + phones.lowerEntry(5552));

       
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", 4);
        marks.put("Physics", 5);
        marks.put("English", 3);
        marks.put("History", 5);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > 4) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getKey().equals("Math")) {
                entry.setValue(entry.getValue() + 1);
            }
        }
        System.out.println("После повышения Math: " + marks);

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "яблоко");
        dictionary.put("book", "книга");
        dictionary.put("school", "школа");
        dictionary.put("dog", "собака");
        dictionary.put("cat", "кот");
        dictionary.put("sun", "солнце");
        dictionary.put("water", "вода");
        dictionary.put("friend", "друг");
        dictionary.put("teacher", "учитель");
        dictionary.put("computer", "компьютер");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово на английском: ");
        String word = sc.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println("Перевод: " + dictionary.get(word));
        } else {
            System.out.println("Перевод не найден");
        }
    }
}

