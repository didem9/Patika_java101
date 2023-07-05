import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        double avg = (mat + fizik + kimya + turkce+ tarih + muzik) / 6.0;

        System.out.println("Not ortalamanız:" + avg);

        String gecmeDurumu = (avg >=60) ? "Tebrikler! Sınıfı Geçtiniz" : "Üzgününüm! Sınıfta Kaldınız";
        System.out.println(gecmeDurumu);
    }
}