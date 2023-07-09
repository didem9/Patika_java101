import java.util.Scanner;

public class UcgenCevreVeAlan {
    public static void main(String[] args) {

        float side1, side2, side3, perimeter, u;
        double area;

        Scanner sideLength = new Scanner(System.in);

        System.out.println("Birinci kenarın uzunluğunu giriniz: ");
        side1 = sideLength.nextFloat();
        System.out.println("İkinci kenarın uzunluğunu giriniz: ");
        side2 = sideLength.nextFloat();
        System.out.println("Üçüncü kenarın uzunluğunu giriniz: ");
        side3 = sideLength.nextFloat();

        u = (side1 + side2 + side3) / 2;
        perimeter = 2*u;
        area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.printf("Üçgenin çevresi: " + "%.2f", perimeter);
        System.out.printf("\n"+"Üçgenin alanı: " + "%.2f", area);

    }
}
