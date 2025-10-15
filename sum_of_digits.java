import java.util.Scanner;
public class sum_of_digits {
    int sum(int a)
    {
        int r;
        int  s=0;
        while(a>0)
        {
        r=a%10;
        s=s+r;
        a=a/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        sum_of_digits call=new sum_of_digits();
       int result = call.sum(n);
       System.out.println("sum of digits of number "+n+" is "+result);
    }
}
