import java.util.Scanner;               //x^2/10+x^3/15+x^4/20+...x^n/n
class series8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x, n, i, j;
        double t, sum=0.0;
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=2;i<=n;i++)
        {
            t = Math.pow(x,i);
            for(j=10;j<=n;j+=5)
            {
                sum = sum+(t/j);
                System.out.println(sum);
            }
        }
    }
}
         