import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Dizi elemanları: "+ Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Dizinin sıralanmış hali: "+ Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = input.nextInt();

        int minCl = 0;
        int maxCl = list[list.length - 1] + 1;

        for (int i: list) {
            if (i < num && i > minCl){
                minCl = i;
            }
        }

        for (int i: list) {
            if (i > num && i < maxCl){
                maxCl = i;
            }
        }
        System.out.println("Girilen değere en yakın en küçük sayı: "+ minCl);
        System.out.println("Girilen değere en yakın en büyük sayı: "+ maxCl);
    }
}