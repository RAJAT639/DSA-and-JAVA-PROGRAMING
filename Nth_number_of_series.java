import java.util.Scanner;
public class Nth_number_of_series 
{
    int term(int a)
    {
        int s=0;
        for (int i=1;i<=a;i++)
        {
           s=s+i;
        }
        return s;
    }
    //series 1, 3, 6, 10, 15, 21...
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a nth term number");
        int n =sc.nextInt();
        Nth_number_of_series call=new Nth_number_of_series();
        int number =call.term(n);
          System.out.println("Nth term is "+number);
    }
}
