public class Main {
    public static void main(String[] args) {
        System.out.println("My first maven project !");

        Student student = new Student();
        student.getAge();
       /// Student student1 = new Student("Maria", 14);
        Student student2 = Student.builder().age(22).build();
        Student student3 = Student.builder().age(22).name("Cucu").build();
    }
}
