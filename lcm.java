import java.util.Scanner;

public class lcm {
     int calculate(int x,int y)
{
    int s=Math.min(x, y);
    int z=Math.max(x, y);
    for(int i=z;i<=Math.max(x,y);i++)
    {
        if(i%s==0||y%i==0)
        {
            return i;
        }
    }
    return s*z;
}
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        lcm call=new lcm();
       System.err.println("LCM OF "+a+" and "+b+" is "+ call.calculate(a,b));
    }
}

    
