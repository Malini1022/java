import java.util.Scanner;
public class MultiplicationTables
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter value for m:");
        int m = scanner.nextInt();

        System.out.print("enter value for n:");
        int n = scanner.nextInt();

        if(m>=n)
        {
            System.out.println("invalid input ensure m < n");
            return;
        }
        for(int i=m; i<=n; i++)
        {
            System.out.print("multiplication tble for" + i + ":");
            for(int j=1; j<=10; j++)
            {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
        scanner.close();
    }
}