import java.time.LocalDate;

public class Main {
    public static void yearCheck (int time) {
        if ((time % 4 == 0 && time % 100 != 0) || time % 400 == 0) {
            System.out.println(time + " год является високосным");
        } else {
            System.out.println(time + " год не является високосным");
        }
    }
    public static void appDownload (int currentYear, int os) {
        if (os == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void main(String[] args) {
        System.out.println("Методы");
        System.out.println("--------------------------");
        System.out.println("Задача №1");
        int year = 2023;
        yearCheck(year);
        //
        System.out.println("--------------------------");
        System.out.println("Задача №2");
        int clientDeviceOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        appDownload(year, clientDeviceOS);
        }
    }