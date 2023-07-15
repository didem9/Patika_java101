import java.util.Scanner;

// Ters üçgen çizdiren program

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}