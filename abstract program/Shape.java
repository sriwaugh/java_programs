package abstract_program;

abstract class Shape{
    protected double length;
    protected double width;
    protected double radius;
    protected double s1;
    protected double s2;
    protected double s3;


    public void setLengthAndWidth(double l,double w)
    {
        length =l;
        width =w;
    }



    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public abstract double area();
    public abstract double perimeter();
}