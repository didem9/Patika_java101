import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float price, dist, perKm, openingPrice = 10f;
        perKm = 2.20f;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gidilecek mesafeyi KM cinsinden giriniz: ");
        dist = input.nextFloat();


        price = openingPrice + (dist * perKm);
        price = price < 20 ? 20 : price;
        System.out.printf("Ödenecek tutar: " + "%.2f" + " TL",price);

    }
}