import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {       //dizideki değeri bulursa false döndürür
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] list = {5, 2, 12, 5, 4, 7, 4, 5, 2};
        int[] duplicate = new int[list.length];             // tekrar eden sayıları bulmak için
        System.out.println("Dizi: "+ Arrays.toString(list));
        System.out.println("\nDizide tekrar eden sayılar: ");
        int startIndex = 0;
        int counter = 1;

        for (int i = 0; i < list.length; i++) {
            if (isFind(duplicate, list[i])) {               //Değer duplicate dizisinde yoksa counter güncellenir
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && list[i] == list[j]) {
                        counter++;
                    }
                }
            }
            if (isFind(duplicate, list[i])) {               // Değer duplicate dizisinde bulunmuyorsa bu diziye eklenir
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        } System.out.println("\nTekrar eden sayı dizisi:\n" + Arrays.toString(duplicate));
    }
}