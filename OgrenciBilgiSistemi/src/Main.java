public class Main {

    public static void main(String[] args) {
        Teacher mahmut = new Teacher("Mahmut Hoca", "TRH", 444);
        Teacher ogeday = new Teacher("Ogeday", "PRG", 444);
        Teacher ahmet = new Teacher("Ahmet", "BDN", 555);

        Course tarih = new Course("Tarih", mahmut, "TRH");
        tarih.addTeacher(mahmut);

        Course programlama = new Course("Programlama", ogeday, "PRG");
        programlama.addTeacher(ogeday);

        Course beden = new Course("Beden", ahmet, "BDN");
        beden.addTeacher(ahmet);

        Student rabia = new Student("Rabia Çöme", "4", tarih, programlama, beden, 1);

        rabia.studentInfo(rabia);
        rabia.addBulkExamNo(100, 80, 70);
        rabia.calcSozluNotu(10, 50, 90);
        rabia.isPass();
    }
}
