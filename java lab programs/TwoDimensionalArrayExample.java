public class TwoDimensionalArrayExample
{
    public static void main(String[] args)
    {
        int[][] matrix =new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;
         
        System.out.println("elements At (0,0):"+matrix[0][0]);
        matrix[1][1]=10;
        System.out.println("Modified elements at(1,1):"+matrix[1][1]);
        System.out.println("Matrix elements");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.println(matrix[i][j]+"");
            }
            System.out.println();
        }
        
    }
}