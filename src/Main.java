public class Main {
    public static void yearCheck (int time) {
        if ((time % 4 == 0 && time % 100 != 0) || time % 400 == 0) {
            System.out.println(time + " год является високосным");
        } else {
            System.out.println(time + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        System.out.println("Методы");
        System.out.println("--------------------------");
        System.out.println("Задача №1");
        int year = 2023;
        yearCheck(year);
        }
    }