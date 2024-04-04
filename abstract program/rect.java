package abstract_program;

class rect extends Shape {
    public rect(double l,double w)
    {
        length=l;
        width=w;
    }
    public double area()
    {
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }}