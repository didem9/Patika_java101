import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, sum, setNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Serinin eleman sayısını girin: ");
        setNum = input.nextInt();

        System.out.print(num1 + " " + num2);

        for (int i = 3; i <= setNum; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(" " + sum);
        }
    }
}