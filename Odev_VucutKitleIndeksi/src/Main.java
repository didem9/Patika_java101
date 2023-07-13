import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float weight, height;
        double bmi;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz (kg): ");
        weight = input.nextFloat();
        System.out.println("Lütfen boyunuzu giriniz (m): ");
        height = input.nextFloat();

        // Kilo (kg) / Boy(m) * Boy(m)
        bmi = weight / (height * height);
        //System.out.println("Vücut kitle indeksiniz: " +bmi);
        System.out.printf("Vücut kitle indeksiniz: " + "%.2f",bmi);

    }
}