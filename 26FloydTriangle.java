import java.util.Scanner;

class FloydTriangle
{
    public static void main(String args[])
    {
        System.out.print("Number of Rows : ");
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k +" ");

                k++;

            }
            System.out.println("");

        }

        sc.close();

    }


}