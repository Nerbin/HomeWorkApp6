package app;

import java.util.Scanner;

public class HomeWorkMainApp {

    public static void main(String[] args) {

        System.out.println("Введите свою зарплату");
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        if (0>=salary){
            System.out.println("Зарплата не может быть нулем или отрицательным числом попробуйте еще раз");
            return;
        }

         if(0<salary && salary<=10_000){
             double tax;
             tax = salary*0.025;
             double salaryAfterTax = salary - tax;
             System.out.printf("Ваша зарплата после уплаты налогов %.2f уплатили налогов %.2f",salaryAfterTax,tax);
        }
        else if(10_000<salary && salary<=25_000){
             double tax;
             tax = salary*0.043;
             double salaryAfterTax = salary - tax;
             System.out.printf("Ваша зарплата после уплаты налогов %.2f уплатили налогов %.2f",salaryAfterTax,tax);

        }
        else {
             double tax;
             tax = salary*0.067;
             double salaryAfterTax = salary - tax;
             System.out.printf("Ваша зарплата после уплаты налогов %.2f уплатили налогов %.2f",salaryAfterTax,tax);

         }






    }
}
