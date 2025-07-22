public class Stirng {
    public static void main(String[] args) {

        String str1 = "Programming";
        System.out.println("Задание 1: Длина строки = " + str1.length());


        String str2 = "Hello";
        System.out.println("Задание 2: Третий символ = " + str2.charAt(2));


        String str3 = "I love Java";
        String sub = str3.substring(2, 6);
        System.out.println("Задание 3: Вырезанное слово = " + sub);


        String str4 = "I like cookies";
        int index = str4.indexOf('c');
        System.out.println("Задание 4: Индекс буквы 'c' = " + index);


        String str5 = "Java";
        System.out.println("Задание 5: Верхний регистр = " + str5.toUpperCase());
        System.out.println("Задание 5: Нижний регистр = " + str5.toLowerCase());


        String str6 = "banana";
        String replaced = str6.replace('a', '*');
        System.out.println("Задание 6: После замены = " + replaced);


        String a = "Hello";
        String b = new String("Hello");

        System.out.println("Задание 7: Сравнение через == : " + (a == b));
        System.out.println("Задание 7: Сравнение через equals() : " + a.equals(b));
    }
}
