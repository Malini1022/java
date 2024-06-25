import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
        int f=0, s=1, next;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = ob.nextInt();
        System.out.println("fibonacci Senes is:");
        for(int i=1; i<=n; i++)
        {
            System.out.println(f+"");
            next = f+s;
            f=s;
            s = next;
        }
    }
}