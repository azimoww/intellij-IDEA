public class HomeworkCasting {

        public static void main(String[] args) {


            int a = 200;
            byte b = (byte) a;
            System.out.println("int 200 в byte = " + b);

            double d = 15.75;
            int dToInt = (int) d;
            System.out.println("double 15.75 в int = " + dToInt);
            System.out.println("Дробная часть исчезла, потому что при преобразовании double -> int сохраняется только целая часть.");



            byte x = 50;
            short y = 60;
            int sumInt = x + y;
            System.out.println("Сумма byte + short в int = " + sumInt);


            byte sumByte = (byte) (x + y);
            System.out.println("Сумма byte + short в byte (с приведением) = " + sumByte);

            long l = 100000;
            float f = l;
            double dd = l;
            System.out.println("long 100000 в float = " + f);
            System.out.println("long 100000 в double = " + dd);
            System.out.println("Число не изменилось, так как диапазон float и double позволяет хранить такие значения.");



            double price = 19.99;
            int quantity = 3;
            double total = price * quantity;
            System.out.println("Общая стоимость (double) = " + total);

            int totalInt = (int) total; // откинули копейки
            System.out.println("Общая стоимость (int, без копеек) = " + totalInt);


            // ===== Исследование =====
            int n1 = 128;
            int n2 = 258;
            int n3 = 1024;

            byte b1 = (byte) n1;
            byte b2 = (byte) n2;
            byte b3 = (byte) n3;

            System.out.println("128 в byte = " + b1);
            System.out.println("258 в byte = " + b2);
            System.out.println("1024 в byte = " + b3);

            System.out.println("Объяснение: тип byte хранит числа от -128 до 127.");
            System.out.println("Если число выходит за пределы, происходит переполнение (остаток от деления на 256).");
        }
    }

