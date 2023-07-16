import java.util.Scanner;

// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alıp
// Uçuşun toplam fiyatını ve koşullara göre müşteriye indirimli fiyatı hesaplar

public class Main {
    public static void main(String[] args) {

        float perKm = 0.10f, discountAge12 = 0.5f, discountAge1224 = 0.1f, discountAge65 = 0.3f, discountTripType2 = 0.2f; // indirim oranları
        float distance;
        double ageDiscount, typeDiscount;
        int age, tripType;
        double regularFlightFee, cutPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz (km): ");
        distance = input.nextFloat();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini seçin \n(Tek yön için 1, Gidiş-Dönüş için 2'ye basın): ");
        tripType = input.nextInt();

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            regularFlightFee = perKm * distance;
            System.out.println("Normal tutar = " + regularFlightFee);
            if (age < 12) {
                ageDiscount = regularFlightFee * discountAge12;
                cutPrice = regularFlightFee - ageDiscount;

                if (tripType == 1) {
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                } else {
                    typeDiscount = cutPrice * discountTripType2;
                    cutPrice = 2 * (cutPrice - typeDiscount);
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                }
            } else if (age <= 24) {
                ageDiscount = regularFlightFee * discountAge1224;
                cutPrice = regularFlightFee - ageDiscount;

                if (tripType == 1) {
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                } else {
                    typeDiscount = cutPrice * discountTripType2;
                    cutPrice = 2 * (cutPrice - typeDiscount);
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                }

            } else if (age >= 65) {
                ageDiscount = regularFlightFee * discountAge65;
                cutPrice = regularFlightFee - ageDiscount;

                if (tripType == 1) {
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                } else {
                    typeDiscount = cutPrice * discountTripType2;
                    cutPrice = 2 * (cutPrice - typeDiscount);
                    System.out.printf("Ödenmesi gereken tutar: " + "%.2f", cutPrice);
                }
            }
        }else {
            System.out.println("Hatalı veri girdiniz.");
        }
    }
}