import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava kaç derece: ");
        heat = input.nextFloat();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if((heat >= 5) && (heat < 10)){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if((heat >= 10) && (heat < 15)) {
            System.out.println("İsterseniz sinemaya gidebilir isterseniz piknik yapabilirsiniz");
        }
        else if ((heat >= 15) && (heat <= 25)) {
            System.out.println("Piknik yapabilirisiniz");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}