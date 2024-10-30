import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1, 2: введите число 0 — iOS, 1 — Android");
        int clientOS = in.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Введите год выпуска телефона:");
                int clientDeviceYear = in.nextInt();
                if (clientDeviceYear >= 2015){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Введите год выпуска телефона:");
                int clientDeviceYear1 = in.nextInt();
                if (clientDeviceYear1 >= 2015){
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
        System.out.println("Задание 3: введите год");
        int years = in.nextInt();
        if (years >= 1584) {
            if ((years % 4 == 0) && (years % 100 !=0) || (years % 400 == 0)) {
                System.out.println(years+" год является високосным");
            }
            else {
                System.out.println(years+" год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1583");
        }

        System.out.println("Задание 4: введите расстояние в км");
        int  deliveryDistance = in.nextInt();
                if (deliveryDistance >= 0 && deliveryDistance <= 19){
                    System.out.println("Доставка в пределах " +deliveryDistance+ " км занимает сутки");
                } if (deliveryDistance >= 20 && deliveryDistance <= 59) {
                    System.out.println("Доставка в пределах "+deliveryDistance+" км занимает 2 дня");
                }
        if (deliveryDistance >= 60 && deliveryDistance <= 99) {
            System.out.println("Доставка в пределах "+deliveryDistance+" км занимает 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задание 5: Введите значение от 1 до 12");
        int monthNumber = in.nextInt();
                switch (monthNumber) {
                    case 1: 
                    case 2: {
                         System.out.println("Зима");
                         break;
                     }
                    }
                    case 2: {
                        System.out.println("Зима");
                        break;
                    }
                    case 3: {;
                    }
                    case 4: {
                    }
                    case 5: {
                        System.out.println("Весна");
                        break;
                    }
                    case 6: {
                    }
                    case 7: {
                    }
                    case 8: {
                        System.out.println("лето");
                        break;
                    }
                    case 9: {
                    }
                    case 10: {
                    }
                    case 11: {
                        System.out.println("Осень");
                        break;
                    }
                    case 12: {
                        System.out.println("Зима");
                        break;
                    }
                    default:
                        System.out.println("Вводимое число должно быть от 1 до 12! ");
                }
            }
            }




