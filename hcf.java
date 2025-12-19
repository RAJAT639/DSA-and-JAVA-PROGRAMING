import java.util.Scanner;
public class hcf {
    int calculate(int x,int y)
{
    int s=1;
    for(int i=1;i<=Math.min(x,y);i++)
    {
        if(x%i==0&&y%i==0)
        {
            s=i;
        }
    }
    return s;
}
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        hcf call=new hcf();
       System.err.println("HCF OF "+a+" and "+b+" is "+ call.calculate(a,b));
    }
}
