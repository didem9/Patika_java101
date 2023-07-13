import java.util.Scanner;

//Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

public class Main {
    public static void main(String[] args) {
        int i, numb, count = 0, total = 0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        numb = input.nextInt();

        System.out.println("3 ve 4'e bölünen sayılar:");
        for (i = 0; i <= numb; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
                System.out.print(String.valueOf(i) + " ");
            }
        }
        average = total / count;
        System.out.println("\nGirilen sayıya kadar 3 ve 4'e bölünen sayıların ortalaması: " + average);
    }
}