import java.util.Scanner;         //1 12 123 12 1
class series6
{
    public static void main()
    {
        int i, j, m, n;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(m=2;m>=1;m--)
        {
            for(n=1;n<=m;n++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
