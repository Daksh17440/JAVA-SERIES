import java.util.Scanner;        //1,3,7,13,21,31...n
class series13
{
    public static void main(int n)
    {
        int i, s=1;
        for(i=0;i<n;i+=2)
        {
            s = s+i;
            System.out.println(s+",");
        }
    }
}