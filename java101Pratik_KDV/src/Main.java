import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       double price, kdvTutari,priceWKDV, kdvOrani;

       System.out.print("Lütfen para miktarını giriniz: ");
       Scanner input = new Scanner(System.in);
       price = input.nextDouble();

       kdvOrani = price <= 1000 ? 0.18 : 0.08;
       kdvTutari = price * kdvOrani;
       priceWKDV = (price +  kdvTutari) ;

        System.out.println("KDV'siz fiyat:" +price);
        System.out.println("KDV Tutarı:" +kdvTutari);
        System.out.println("KDV'li fiyat:" +priceWKDV);
    }
}