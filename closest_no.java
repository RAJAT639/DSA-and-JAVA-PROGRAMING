//Input: n = 13, m = 4
//Output: 12
//Explanation: 12 is the closest to 13, divisible by 4.
import java.util.Scanner;
public class closest_no 
{
    int closest(int a,int b)
    {
        int q=a/b;
        int n1=q*b;
        int n2=(a*b>0)?(b*(q+1)):(b*(q-1));
        if(Math.abs(a-n1)<Math.abs(a-n2))
        return n1;
       else
        return n2;    
    }
public static void main(String args[])
{
    int m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a divisor");
m=sc.nextInt();
System.out.println("enter a dividend");
n=sc.nextInt();
closest_no call=new closest_no ();
int x=call.closest(n,m);
System.out.println("closest no is "+x);

}
    
}
