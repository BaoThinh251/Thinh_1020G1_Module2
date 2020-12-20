package arraylist;

public class MyLinkedList {
    public static class Student{
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
        Student a = new Student(1, "Thinh");
        Student b = new Student(2, "Long");
        Student c = new Student(3, "Nhat");
        Student d = new Student(4, "Tuan");
        Student e = new Student(5, "Son");
        Student f = new Student(6, "Cao");

        MyList<Student> MyStudentList = new MyList<Student>();
        MyList<Student> MyStudentList2 = new MyList<Student>();

        MyStudentList.add(a);
        MyStudentList.add(b);
        MyStudentList.add(c);
        MyStudentList.add(d);
        MyStudentList.add(e);
//        MyStudentList.add(f, 2);

//        MyStudentList2 = MyStudentList.clone();
        MyStudentList.remove(5);


        for(int i = 0; i < MyStudentList.size(); i++){
            Student student = (Student) MyStudentList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//        System.out.println(MyStudentList.size());
//        System.out.println(MyStudentList.get(3).getName());
//        System.out.println(MyStudentList.indexOf(f));
//        System.out.println(MyStudentList.contains(f));

    }
}
