class Animal
{
    void display()
    {
        System.out.println("welcome to zoo");
    }
}
class Lion extends Animal{
    void display()
    {
        System.out.println("lion is king of forest");
    }
}
class Deer extends Animal{
    void display()
    {
        System.out.println("deer is cutest animal");
    }
}
public class DynamicDispath
{
    public static void main(String args[])
    {
        Animal A=new Animal();
        Lion L=new Lion();
        Deer D=new Deer();

        Animal ref;
        ref=A;
        ref.display();

        ref=L;
        ref.display();

        ref=D;
        ref.display();
    }
}
