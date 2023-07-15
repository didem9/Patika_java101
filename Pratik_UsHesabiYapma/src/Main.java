import java.util.Scanner;

// for döngüsü ile üs işlemi aldıran program

public class Main {
    public static void main(String[] args) {
        int base, exp, result = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını girin: ");
        base = input.nextInt();
        System.out.print("Üs değerini girin: ");
        exp = input.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base + " üzeri "+ exp + ": " +result);
    }
}