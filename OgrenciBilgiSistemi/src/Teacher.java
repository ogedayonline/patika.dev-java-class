public class Teacher {
    String name,branch;
    int mpno;

    Teacher(String name,String branch,int mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }
    void print(){
        System.out.println("Adı"+this.name);
        System.out.println("Branşı"+this.branch);
        System.out.println("Telefon Numarası"+this.mpno);
    }
}
