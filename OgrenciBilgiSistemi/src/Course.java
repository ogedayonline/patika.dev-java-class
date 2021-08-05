public class Course {
    Teacher teacher;
    String name, prefix;
    int code, note;
    int sozluNotu;

    Course(String name,Teacher teacher,String prefix) {
        this.name=name;
        this.teacher=teacher;
        this.prefix=prefix;
        this.note=0;
        this.sozluNotu=0;
    }

    void addTeacher(Teacher teacher){
       if(teacher.branch.equals(this.prefix)){
           this.teacher=teacher;


       }
       else {
           System.out.println("Öğretmen ve Ders Uyuşmuyor");
       }

    }
    void printTeacher(){
        teacher.print();
    }



}