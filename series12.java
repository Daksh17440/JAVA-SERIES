import java.util.Scanner;         //-1,0,3,8,15,24,35....n
class series12
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print((i*(i-2))+",");
        }
    }
}
