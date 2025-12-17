import java.util.Scanner;
public class armstrong_number {
    int count_digit(int x)
    {
        int count=0;
        while(x>0)
        {
            x=x/10;
            count++;
        }
        return count;
    }
    void check(int c,int d)
    {
        int z=c;
        int r;
        int s=0;
        while(c>0)
        {
            r=c%10;
            s=s+(int)Math.pow(r,d);
            c=c/10;
        }
        
        if(s==z)
        {
            System.out.println("number is armstrong");
        }
        else          
          System.out.println("number is not armstrong");

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        armstrong_number call=new armstrong_number();
        int digit=call.count_digit(a);
         call.check(a,digit);

    }
}
