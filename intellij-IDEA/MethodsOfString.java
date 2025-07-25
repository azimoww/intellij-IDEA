public class MethodsOfString {
    public static void main(String[] args) {

        Integer a = 123;
        String s = Integer.toString(a);
        System.out.println(s);

        String word = "programming";
        System.out.println(word.charAt(4));

        String text = "Hello, world";
        char[] massive = new char[3];
        text.getChars(8, 10, massive, 0);
        System.out.println(massive);

        String text1 = "Dog";
        char[] symbols = text1.toCharArray();
        for (char c : symbols){
            System.out.println(c);
        }


        String str1 = "Programmer";
        String str2 = "Programm";
        boolean bool = str1.regionMatches(0, str2, 0, 4);
        System.out.println(bool);

        String str3 = "information";
        System.out.println(str3.startsWith("i"));
        System.out.println(str3.endsWith("n"));
        String text3 = "java";
        String text4 = "java";
        System.out.println(text4.compareTo(text3));

        String c = "kanan";
        System.out.println(c.indexOf("n"));
        System.out.println(c.lastIndexOf("n"));


        String s1 = "Hello";
        String s2 = " World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.concat(", Deti"));


        String text_1 = "        Java is Porgramming Language     ";
        System.out.println(text_1);
        System.out.println(text_1.trim());



        int number =  456;
        System.out.println(String.valueOf(number));

        String join_str = String.join(", ", "Kanan", "Aylin", "Mansur");
        System.out.println(join_str);
    }
}