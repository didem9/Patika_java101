public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
       double taxRate = 0.03, taxes = 0;
        if(salary > 1000){
            taxes = this.salary * taxRate;

        }else{
            taxes = 0;
        }
        return taxes;
    }
    double bonus(){
        int minWorkHours = 40, perHour = 30;
        double overTime;
        if(this.workHours > minWorkHours){
            overTime = (this.workHours - minWorkHours) * perHour;
        }
        else{
            overTime = 0;
        }
        return overTime;
    }
    double raiseSalary(){
        int currentYear = 2021, workedYears;
        double lessThan10Raise = 0.05, lessThan20Raise = 0.10, moreThan19Raise = 0.15, extraSalary = 0;
        workedYears = currentYear - this.hireYear;
        if(workedYears < 10){
            extraSalary = this.salary  * lessThan10Raise;
        } else if (workedYears > 9 && workedYears < 20) {
            extraSalary = this.salary  * lessThan20Raise;
        } else if (workedYears > 19) {
            extraSalary = this.salary  * moreThan19Raise;
        }
        return extraSalary;
    }

    void toStringPrint(){
        System.out.println("\nÇalışanın: ");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("İşe giriş yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax()));


    }
}
