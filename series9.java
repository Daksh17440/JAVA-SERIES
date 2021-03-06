import java.util.Scanner;          //1+4+9+16+25+36+49+64+81+100
class series9
{
    public static void main()
    {
        int i, sq, sum=0;
        for(i=1;i<10;i++)
        {
            sq = i*i;
            sum = sum+sq;
            System.out.println(sum);
        }
    }
}