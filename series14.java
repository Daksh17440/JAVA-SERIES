import java.util.Scanner;        //0,3,8,15,24...n
class series14
{
    public static void main(int n)
    {
        int i, s=-1;
        for(i=1;i<n;i+=2)
        {
            s = s+i;
            System.out.print(s+",");
        }
    }
}
