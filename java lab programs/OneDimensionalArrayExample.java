public class OneDimensionalArrayExample
{
    public static void main(String[] args)
    {
        int[] numbers =new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        System.out.println("First element:" +numbers[0]);
        numbers[2]=10;
        System.out.println("Modified third element"+numbers[2]);
        System.out.println("Array element");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]+"");
        }
    }
}