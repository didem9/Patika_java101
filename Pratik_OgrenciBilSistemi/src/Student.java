public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course vivaMat;
    Course vivaFizik;
    Course vivaKimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, Course vivaMat, Course vivaFizik, Course vivaKimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.vivaMat = vivaMat;
        this.vivaFizik = vivaFizik;
        this.vivaKimya = vivaKimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int vivaMat, int vivaFizik, int vivaKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (vivaMat >= 0 && vivaMat <= 100) {
            this.vivaMat.note = vivaMat;
        }

        if (vivaFizik >= 0 && vivaFizik <= 100) {
            this.vivaFizik.note = vivaFizik;
        }
        if (vivaKimya >= 0 && vivaKimya <=100){
            this.vivaKimya.note = vivaKimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.mat.note * 0.8) + (this.vivaMat.note * 0.2)) +
                ((this.fizik.note * 0.8) + (this.vivaFizik.note * 0.2))  +
                ((this.kimya.note * 0.8) + (this.vivaKimya.note * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Notu : " + this.vivaMat.note);
        System.out.println("Fizik Notu : " + this.vivaFizik.note);
        System.out.println("Kimya Notu : " + this.vivaKimya.note);
    }
}
