import java.util.Scanner;          //1+8+27+64+125+216+512+729+1000
class series10
{
    public static void main()
    {
        int i, sq, sum=0;
        for(i=1;i<10;i++)
        {
            sq = i*i*i;
            sum = sum+sq;
            System.out.println(sum);
        }
    }
}
