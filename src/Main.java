import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void chooseTheApplicationVersion(int digit, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        int iOS = 0;
        int android = 1;
        String oS = "Android";
        if (digit == iOS) {
            oS = "iOS";
            if (deviceYear == currentYear) {
                System.out.println("Установите обычную версию приложения для " + oS + " по ссылке");
            } else if (deviceYear < currentYear) {
                System.out.println("Установите облегченную  версию приложения для " + oS + " по ссылке");
            } else {
                System.out.println("Ваше устройство еще не выпущено");
            }
        } else if (digit != android) {
            System.out.println("ОС не поддерживается");
        }

    }


    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска устройства");
        int clientDeviceYear = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите 0, если тип операционной системы iOS. Введите 1, если тип операционной системы Android.");
        int oS = scanner.nextInt();
        chooseTheApplicationVersion(oS, clientDeviceYear);
    }

    public static void calculateWhetherTheLeapYearIs(int enterYear) {
        byte coefficientEach4 = 4;
        byte coefficientEach100 = 100;
        short coefficientEach400 = 400;
        if (enterYear % coefficientEach4 == 0 && enterYear % coefficientEach100 != 0 || enterYear % coefficientEach100 == 0 && enterYear % coefficientEach400 == 0) {
            System.out.println(enterYear + " год является високосным");
        } else {
            System.out.println(enterYear + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        calculateWhetherTheLeapYearIs(year);
    }

    public static int calculateNumberOfDaysOfDelivery(int distance) {
        int daysOfDelivery = 1;
        byte distance20 = 20;
        byte distance60 = 60;
        byte distance100 = 100;
        if (distance < distance20) {
            return daysOfDelivery;
        } else if (distance < distance60) {
            daysOfDelivery = daysOfDelivery + 1;
        } else if (distance <= distance100) {
            daysOfDelivery = daysOfDelivery + 2;
        } else {
            System.out.println("Доставка не осуществляется");
        }
        return daysOfDelivery;
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки в км");
        int deliveryDistance = scanner.nextInt();
        System.out.println("Доставка будет осуществлена за " + calculateNumberOfDaysOfDelivery(deliveryDistance) + " дней");
    }

}