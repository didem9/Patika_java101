import java.util.Scanner;

// Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.

public class Main {

    static void recursiveMinus(int num, int temp) {

        if (num > 0) {                                  // Her çıkarma işlemi sırasında son değeri yazdırıyoruz
            System.out.print(num + " ");
            recursiveMinus(num - 5, temp);
        } else {
            recursivePlus(num, temp);
        }
    }

    static void recursivePlus(int num, int temp) {

        if (temp >= num) {                              // Her toplama işlemi sırasında son değeri yazdırıyoruz
            System.out.print(num + " ");
            recursivePlus(num + 5, temp);
        }
    }

    public static void main(String[] args) {
        int n, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        n = input.nextInt();
        temp = n;

        recursiveMinus(n, temp);

    }
}


