import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. цяло число -> входни данни
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //първоначалната стойност на числото
        //2. разбивам го на цифри
        //повтаряме: число > 0
        //стоп: число <= 0
        //1. взимаме последната цифра -> %10
        //2. махаме от числото -> / 10
        int sumFact = 0; //сумата от факториелите на всяка цифра
        while (number > 0) {
            int lastDigit = number % 10;
            //3. факториел на всяка цифра
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) { //всички числа от 1 до моето
                fact = fact * i;
            }
            //знам колко е факториела на съответната цифра
            //4. сума от факториелите
            sumFact += fact;

            number = number / 10;
        }
        //5. проверка за strong -> сума от факториелите == първоначалното число
        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

