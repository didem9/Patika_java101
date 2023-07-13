import java.util.Scanner;

/* Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program */

public class Main {
    public static void main(String[] args) {
        int num, total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Bir sayı girin: ");
            num = inp.nextInt();

                if (num % 4 == 0)
                    total += num;

        }while (num % 2 == 0);

        System.out.println("Sayıların toplamı: "+total);
    }
}