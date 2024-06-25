class Shape
{
    double calculateArea(double dimension1, double dimension2)
    {
        System.out.println("this method should be overriddeb by subclasss");
        return 0;
    }
}
class Rectangle extends Shape
{
    double calculateArea(double length, double width)
    {
        return length*width;
    }
}
class Triangle  extends Shape
{
    
    double calculateArea(double base, double height)
    {
       return 0.5*base*height;
    }
}
public class FindArea
{
    public static void main(String args[])
    {
        Shape myRectangle=new Rectangle();
        Shape myTriangle=new Triangle();

        double rectangleArea=myRectangle.calculateArea(10,5);
        double triangleArea=myTriangle.calculateArea(10,5);

        System.out.println("area of the Rectangle:" +rectangleArea);
        System.out.println("Area of the triangle:" +triangleArea);
    }
}