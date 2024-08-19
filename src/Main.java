public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i = i + 1 ) {
            System.out.println(" Интерация цикла " + i);
        }
        System.out.println(" Задание 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(" Интерация цикла " + i);
        }
        System.out.println(" Задание 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(" четное число " + i);
        }
        System.out.println(" Задание 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(" Интерация цикла " + i);
        }
        System.out.println(" Задание 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(" Високосный год " + i);
        }
        System.out.println(" Задание 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println(" Задание 7");
        for (int i = 2; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println(" Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println(" Месяц " + i + " Сумма накоплений " + total + " рублей");
        }
        System.out.println(" Задание 9");
        int saLary = 29000;
        int toTal = 0;
        for (int i = 1; i <= 12; i++) {
            toTal = toTal + toTal/100;
            toTal = toTal + saLary;
            System.out.println(" Месяц " + i + " Сумма накоплений " + toTal + " рублей");
        }
        System.out.println(" Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(" 2 * " + i + " = " + 2 * i);
        }



    }
}