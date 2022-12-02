
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        float a = 2.5f;
        float b = 5.5f;
        int c = 8;
        boolean d = (b > a && a > c && b > c);
        if (d) {
            System.out.println("Ближайшее число к проверяемому " + b);
        } else if (a == b) {
            System.out.println("Введенные числа не должны биыть равны");
        } else if (a >= c || b >= c) {
            System.out.println("Введенное число не должно быть больше или равно проверяемого");
        } else {
            System.out.println("Ближайшее число к проверяемому " + a);
        }
    }

    public static void task2() {
        System.out.println("Домашняя работа");
        int a1 = 2;
        int b1 = 6;
        int a2 = 1;
        int b2 = 3;
        if (b1 < a2) {
            System.out.println("Отрезки не пересекаются");
        } else if ((a1 < a2 && a2 < b1) || (a2 < b1 && a2 < b2)) {
            System.out.println("Начало отрезка " + a2);}
       // } else if (a1 < b2 && a2 < b2 && b2 > b1

    }
}
