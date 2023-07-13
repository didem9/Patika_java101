import java.util.Scanner;

// Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

public class Main {
    public static void main(String[] args) {
        int num;
        int i, j;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = inp.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for(i = 1; i <= num; i *= 4){
            System.out.print(i + ",");
        }
        System.out.println("\n");

        System.out.println("5'in kuvvetleri:");
        for(j = 1; j <= num; j *= 5){
            System.out.print(j + ",");
        }
    }
}