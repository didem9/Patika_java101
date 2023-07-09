import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float radius, perimeter, alpha;
        float pi = 3.14f;
        double area, areaWithAngle;

        // Area: π * r * r;        Perimeter: 2 * π * r;

        Scanner inpRadius = new Scanner(System.in);
        System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
        radius = inpRadius.nextFloat();

        area = pi * Math.pow(radius,2);
        perimeter = 2 * pi * radius;

        System.out.printf("Dairenin alanı: "+ "%.2f", area);
        System.out.printf("\n"+"Dairenin çevresi: "+ "%.2f", perimeter);

        // Area with center angle : (𝜋 * (r*r) * 𝛼) / 360

        Scanner inpAng = new Scanner(System.in);
        System.out.println("\n"+"Dairenin merkez açısını giriniz: ");
        alpha = inpAng.nextFloat();

        areaWithAngle = (pi * (radius * radius) * alpha) / 360;
        System.out.printf(alpha + " derecelik daire diliminin alanı: "+ "%.2f", areaWithAngle);

    }
}