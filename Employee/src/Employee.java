public class Employee {
    Employee employee;
    String name;
    int salary;
    int workHour;
    int hireYear;
    int saatBasi=30;
    int prim=0;
    int tax=0;
    int toplamMaas=0;

    public Employee(String name, int salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }
    void employeeInfo(){
        System.out.println("Adı "+this.name);
        System.out.println("Maaşı "+this.salary);
        System.out.println("Çalışma Saati "+this.workHour);
        System.out.println("İşe giriş tarihi "+this.hireYear);
    }
    void tax(){
        if(this.salary>1000){
         tax=(this.salary*3)/100;
            System.out.println(tax);
        }
       else{ System.out.println(tax);
    }
    }
    void bonus() {
        if (workHour - 40 > 0) {
            prim = (workHour - 40) * 30;
            System.out.println(prim);
        } else {
            System.out.println(prim);
        }
    }
    void raiseSalary(){
        if(2021-this.hireYear<10){
            this.salary=(this.salary*5)/100;
            System.out.println(this.salary);
        }
        else if(2021-this.hireYear>=10&&2021-this.hireYear<20){
            this.salary=(this.salary*10)/100;
            System.out.println(this.salary);
        }
        else if(2021-this.hireYear>=20){
            this.salary=(this.salary*15)/100;
            System.out.println(this.salary);
        }
    }
    void toplamMaas(){
       this.toplamMaas= this.salary+this.prim;
        System.out.println(toplamMaas);
    }
}
