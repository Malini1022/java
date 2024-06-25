class Outer
{
    static int a=10;
    int b=20;
    static class Nested
    {
        void display()
        {
            System.out.println("value of a="+a);
        }
        
    }
    class Inner
    {
        int c=50;
        void print()
        {
            System.out.println("Value of a="+a);
            System.out.println("value of b="+b);
            System.out.println("value of c="+c);
        }
    }
}
public class NestedClass
{
    public static void main(String args[])
    {

    
     Outer O=new Outer();
     Outer.Inner I=O.new Inner();
     Outer.Nested N=new Outer.Nested();
     N.display();
     I.print();
   }
}