package abstract_program;

public class cir extends Shape{
    public cir(double r)
        {
            radius=r;
        }
        public double area()
        {
            return 3.14*radius*radius;
        }
        public double perimeter()
        {
            return 2*3.14*radius;
        }}


