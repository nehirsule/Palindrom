import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, revesreNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            revesreNumber = (revesreNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == revesreNumber) {
            System.out.println(number + " Sayısı Palindrom bir sayıdır.");
            return true;
        } else {
            System.out.println(number + " Sayısı Palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Saylı Giriniz : ");
        int number = input.nextInt();
        System.out.println(isPalindrom(number));

    }
}
