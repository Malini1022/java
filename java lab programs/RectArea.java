class Rectangle
{
    int length, breadth;
    void getData(int x, int y)
    {
        length=x;
        breadth=y;
    }
    int calcRect()
    {
        return(length*breadth);
    }
}
public class RectArea
{
    public static void main(String arg[])
    {
        int area1, area2;
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.length=5;
        r1.breadth=6;
        area1=r1.length*r1.breadth;
        r2.getData(10, 20);
        area2=r2.calcRect();
        System.out.println("Area1=" +area1);
        System.out.println("Area2=" +area2);
    }
}