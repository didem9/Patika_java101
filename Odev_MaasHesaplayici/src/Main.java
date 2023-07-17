//Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını
// hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

public class Main {
    public static void main(String[] args) {
        Employee staff1 = new Employee("Kemal", 2000,45, 1985);
        Employee staff2 = new Employee("Mustafa", 3000,50, 2010);

        staff1.toStringPrint();
        staff2.toStringPrint();
    }
}