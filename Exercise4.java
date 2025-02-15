// Do not modify this code

public class Exercise4 {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", 123);
        student1.addCourse("Math");
        student1.addCourse("Science");

        Student student2 = new Student(student1);
        student2.addCourse("History");

        System.out.println(student1);
        System.out.println(student2);
    }
}
