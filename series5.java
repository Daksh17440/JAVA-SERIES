import java.util.Scanner;         //1514131211 10987 654 32 1
class series5
{
    public static void main()
    {
        int i, j, P=15;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(P);
                P--;
            }
            System.out.println("");
        }
    }
}
