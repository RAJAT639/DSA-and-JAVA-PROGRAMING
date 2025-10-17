import java.util.Scanner;
public class perfect_number {
    void check(int n)
    { int s=0;
        for(int i=1;i<=n/2;i++)
        {
          if(n%i==0)
          s=s+i;
        }
        if(s==n) 
        System.out.println("number is perfect number");
        else
        System.out.println("number is not a perfect number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        perfect_number call=new perfect_number();
        call.check(a);
    }
}
