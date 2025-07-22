class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder greeting = new java.lang.StringBuilder("Hello");
        greeting.append(" World!");
        System.out.println("Задание 1: " + greeting);

        java.lang.StringBuilder insertExample = new java.lang.StringBuilder("Java fun");
        insertExample.insert(5, "is ");
        System.out.println("Задание 2: " + insertExample);

        java.lang.StringBuilder replaceExample = new java.lang.StringBuilder("I like Java");
        int start = replaceExample.indexOf("Java");
        replaceExample.replace(start, start + 4, "Python");
        System.out.println("Задание 3: " + replaceExample);

        java.lang.StringBuilder deleteExample = new java.lang.StringBuilder("Delete this word");
        int startDel = deleteExample.indexOf("this");
        deleteExample.delete(startDel, startDel + 4);
        System.out.println("Задание 4: " + deleteExample);

        java.lang.StringBuilder reverseExample = new java.lang.StringBuilder("12345");
        reverseExample.reverse();
        System.out.println("Задание 5: " + reverseExample);

        java.lang.StringBuilder lengthExample = new java.lang.StringBuilder("Java Programming");
        System.out.println("Задание 6: Длина строки = " + lengthExample.length());

        java.lang.StringBuilder cutEnd = new java.lang.StringBuilder("ABCDEFGHIJKLMNOPQRST");
        cutEnd.delete(cutEnd.length() - 5, cutEnd.length());
        System.out.println("Задание 7: " + cutEnd);

        java.lang.StringBuilder firstTen = new java.lang.StringBuilder("ProgrammingInJava");
        firstTen.delete(10, firstTen.length());
        System.out.println("Задание 8: " + firstTen);

        java.lang.StringBuilder fixChar = new java.lang.StringBuilder("Hell0");
        fixChar.setCharAt(4, 'o');
        System.out.println("Задание 9: " + fixChar);

        java.lang.StringBuilder template = new java.lang.StringBuilder("User {name} has {points} points");
        int nameStart = template.indexOf("{name}");
        template.replace(nameStart, nameStart + 6, "Ali");
        int pointsStart = template.indexOf("{points}");
        template.replace(pointsStart, pointsStart + 8, "150");
        System.out.println("Задание 10: " + template);
    }
}

