import java.util.Scanner;         //1 23 456 78910 1112131415
class series4
{
    public static void main()
    {
        int i, j, a=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println("");
        }
    }
}