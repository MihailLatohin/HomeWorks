package HomeWork2;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args)
            throws IOException {

        //Опрделение сезона по номеру месяца

        String season;
        int month;

        System.out.print("Введите номер месяца: ");
        Scanner num = new Scanner(System.in);
        month = num.nextInt();

        System.out.println("Ваш месяц: " + month);


        if (month <= 2 && month > 0 || month == 12) {
            season = "winter";
            System.out.println("It's a " + season + " month");
        } else if (month < 6 && month > 2) {
            season = "spring";
            System.out.println("It's a " + season + " month");
        } else if (month < 10 && month > 8) {
            season = "autumn";
            System.out.println("It's a " + season + " month");
        } else  if (month >= 6 && month <= 8 ){
            season = "summer";
            System.out.println("It's a " + season + " month");
        } else {
            System.out.println("Season not found");
        }

        System.out.println("\n");

        //Меню

        char choice;

            System.out.println("Введите номер блюда: ");
            System.out.println(" 1. Жаркое");
            System.out.println(" 2. Суп");
            System.out.println(" 3. Салат");
            System.out.println(" 4. Гречка");
            System.out.println(" 5. Котлета");
            System.out.println("Выберете пункт меню: ");
            choice = (char) System.in.read();

        System.out.println("\n ---------------");

        switch (choice) {
            case '1':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №1");
                System.out.print(" - жаркое");
                break;
            case '2':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №2");
                System.out.print(" - суп");
                break;
            case '3':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №3");
                System.out.print(" - салат");
                break;
            case '4':
                System.out.println("Вы выбрали: ");
                System.out.print("Блюдо №4");
                System.out.print(" - гречка");
                break;
            case '5':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №5");
                System.out.print(" - котлета");
                break;
            default:
                System.out.println("Такого блюда нет в списке");
        }
    }
}