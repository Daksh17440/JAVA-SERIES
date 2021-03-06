import java.util.Scanner;         //0,2,6,12,20....n
class series11
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print((i*(i-1))+",");
        }
    }
}