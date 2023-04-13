//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
//        к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        boolean temp = false;
        do {
            try {
                Scanner iScanner = new Scanner(System.in);
                System.out.print("Введи дробное число: ");
                float n = iScanner.nextFloat();
                System.out.println(n);
                temp = true;
            } catch (Exception e) {
                System.out.println("Введено не дробное число");
                temp = false;
            }
        }    while (!temp);
    }
}

