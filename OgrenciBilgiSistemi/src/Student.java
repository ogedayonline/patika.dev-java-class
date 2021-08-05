public class Student {
    String name;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    int stuNo;
    double avarage;
    boolean isPass;


    Student(String name,String classes,Course c1,Course c2,Course c3,int stuNo){
        this.name=name;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.stuNo=stuNo;
        this.avarage=0.0;
        this.isPass=false;

    }
    void studentInfo(Student student){
        this.name=name;
        System.out.println(name);
    }
    void addBulkExamNo(int note1,int note2,int note3) {
        if(note1>0&&note1<=100){
            this.c1.note=note1;
        }
        if(note2>0&&note2<=100){
            this. c2.note=note2;
        }
        if(note3>0&&note3<=100){
            this. c3.note=note3;
        }

    }
    void isPass() {
    this.avarage=((c1.note*0.80+c1.sozluNotu*0.20)+(c2.note*0.80+c2.sozluNotu*0.20)+(c3.note*0.80+c3.sozluNotu*0.20))/3.0;
        System.out.println("==============");
        printNote();
        System.out.println("==============");
        printSozluNotu();
        System.out.println("==============");
    if(this.avarage>=55){
        System.out.println(" Sınıfı "+this.avarage+" ortalama ile geçtiniz");
    }
    else {
        System.out.println(+avarage+" ortalama ile kaldınız.");
        }
    }
    void calcSozluNotu(int sn1,int sn2,int sn3){
        if(sn1>0&&sn1<=100){
            this.c1.sozluNotu=sn1;
        }
        if(sn2>0&&sn2<=100){
            this.c2.sozluNotu=sn2;
        }
        if(sn3>0&&sn3<=100){
            this.c3.sozluNotu=sn3;
        }

    }



    void printNote() {
        System.out.println(this.c1.name+" dersinin notu:"+this.c1.note);
        System.out.println(this.c2.name+" dersinin notu:"+this.c2.note);
        System.out.println(this.c3.name+" dersinin notu:"+this.c3.note);


    }
    void printSozluNotu(){
        System.out.println(this.c1.name+" dersinin sözlü notu "+this.c1.sozluNotu);
        System.out.println(this.c2.name+" dersinin sözlü notu "+this.c2.sozluNotu);
        System.out.println(this.c3.name+" dersinin sözlü notu "+this.c3.sozluNotu);
    }


}
