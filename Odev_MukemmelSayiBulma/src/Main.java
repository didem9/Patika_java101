import java.util.Scanner;

//Tam sayı çarpanları toplamı kendisine eşit olan sayıya mükemmel sayı denir. Bu

public class Main {
    public static void main(String[] args) {
        int num, result = 0;

        Scanner number = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = number.nextInt();

        for (int i = 1; i < num; i++){      // Kendisi hariç tam sayı bölenlerini bulmak için
            if(num % i == 0 ){
                result += i;
            }
        }
        if (num == result){
            System.out.println(num + " Mükemmel sayıdır.");
        }else
            System.out.println(num + " Mükemmel sayı değildir.");


    }
}