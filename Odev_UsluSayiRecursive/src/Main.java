import java.util.Scanner;

// Recursive metodu ile üslü sayı hesaplayan program

public class Main {

    static int recursivePower(int base, int exp) {

        if (exp == 0){
            return 1;
        }else
            return base * recursivePower(base, exp-1);
    }

    public static void main(String[] args) {
        int numb, expo;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını girin: ");
        numb = input.nextInt();
        System.out.print("Üs değerini girin: ");
        expo = input.nextInt();

        System.out.println(numb + " üzeri " + expo + ": " + recursivePower(numb, expo));
    }
}
