package WwodDaty;

//*
// 1) Имеются три числа - день, месяц и год, вводимые пользователем с
//  консоли.     Вывести дату следующего дня в формате
//  "День.Месяц.Год".     Учесть переход на следующий месяц,
//  а также следующий год.     Форматирование строки "День.Месяц.



import java.util.Scanner;

public class Wwod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("введите день:");
        int day = scanner.nextInt();
        System.out.print("введите месяц:");
        int mon = scanner.nextInt();
        System.out.print("введите год:");
        int year = scanner.nextInt();

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        int [] maxdays = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear) {
            int[1] maxdays = 29;
         }

        if (day < maxdays) {
            System.out.println( "следующий день:" + day ++, mon, year);
        } else if (day == maxdays) {
            System.out.println("следующий день:" + day == 1, mon ++, year);
        }else if (day == maxdays || mon == 12) {
            System.out.println("следующий день:" + day == 1, mon ==1, year ++);
        }



    }
}
