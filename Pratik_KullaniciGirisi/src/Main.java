import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String username, password, option, newPassword;

    Scanner input = new Scanner(System.in);

       System.out.print("Kullanıcı adınız: ");
       username = input.nextLine();

       System.out.print("Şifreniz: ");
       password = input.nextLine();

       if(username.equals("patika") && password.equals("java123"))
       {
           System.out.println("Giriş Başarılı!");
       }
       else
       {
           System.out.println("Yanlış şifre girdiniz.\nŞifrenizi sıfırlamak ister misiniz?\n(Evet / Hayır şeklinde cevaplaynız)");
           option = input.nextLine();

           if(!option.equals("Evet"))
           {
               System.out.println("Şifre sıfırlama işlemi iptal edildi");
           } else
            {
                System.out.println("Yeni şifrenizi girin");
                newPassword = input.nextLine();
                if (newPassword.equals("java123"))
                {
                    do
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                        newPassword = input.nextLine();
                    }while(newPassword.equals("java123"));

                    System.out.println("Yeni şifre oluşturuldu");
                }
                else
                {
                    System.out.println("Yeni şifre oluşturuldu");
                }
            }
       }
  }
}