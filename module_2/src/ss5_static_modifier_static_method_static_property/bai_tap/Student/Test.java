package ss5_static_modifier_static_method_static_property.bai_tap.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasses());
        Student student1 = new Student("Dat Cute", "C1022G1");
        System.out.println("Name : " + student1.getName());
        System.out.println("Class : " + student1.getClasses());
    }
}
