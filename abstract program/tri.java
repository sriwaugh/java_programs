package abstract_program;


    class tri extends Shape
    {

        public tri(double i,double i1,double i2)
        {
            s1=i;
            s2=i1;
            s3=i2;
        }
        public double area()
        {
            double s=(s1+s2+s3)/3;
            return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        }
        public double perimeter()
        {
            return s1+s2+s3;
        }}

