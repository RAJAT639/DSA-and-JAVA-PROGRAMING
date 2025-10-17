import java.util.Scanner;
public class factorial {
    int calculate(int n)
    {
        int sum=1;
        for(int i=n;i>=1;i--)
        {
        sum=sum*i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        factorial call=new factorial();
      int result= call.calculate(a);
       System.out.println("factorial of "+a+" is "+ result);
    }
}
