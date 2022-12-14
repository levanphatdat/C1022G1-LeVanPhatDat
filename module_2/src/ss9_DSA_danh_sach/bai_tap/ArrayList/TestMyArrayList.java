package ss9_DSA_danh_sach.bai_tap.ArrayList;

import ss5_static_modifier_static_method_static_property.bai_tap.Student.Student;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Dat");
        Student student2 = new Student(2, "Nghi");
        Student student3 = new Student(3, "Khai");
        Student student4 = new Student(4, "Truong");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(1, student4);
        studentMyArrayList.size();
        System.out.println(studentMyArrayList.size());
        System.out.println(studentMyArrayList.get(3).getName());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
