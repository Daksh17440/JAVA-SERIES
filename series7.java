import java.util.Scanner;         //* ** *** ** *
class series7
{
    public static void main()
    {
        int i, j, m, n;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(m=2;m>=1;m--)
        {
            for(n=1;n<=m;n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
