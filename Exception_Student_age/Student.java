package java_program.Exception_Student_age;
public class Student {
    private int age;
    public void setage(int n)throws Exception {
        if(n<0)
        {
            throw new Exception("Invalid age");
        }
        this.age=n;
    }
    public int getage()
    {
        return age;
    }


}
