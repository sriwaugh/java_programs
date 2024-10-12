package java_program;

public class thisKeyword {
    public static void main(String[] args) {
        String name="Sri";
        Student sri= new Student(name);
        System.out.println(sri.name);
    }
}
class Student{
     String name="waugh";
     Student(String name){
        name=name;
     }
}

