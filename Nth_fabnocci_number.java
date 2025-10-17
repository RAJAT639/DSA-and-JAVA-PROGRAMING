import java.util.Scanner;
public class Nth_fabnocci_number {
    void number(int n)
    {
        int s=0;
        int pre1=0;
        int pre2=1;
        if(n>=1)
        for(int i=2;i<=n;i++)
        {
            s=pre1+pre2;
            pre1=pre2;
            pre2=s;
          
        }
          System.out.println(s);
        
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        Nth_fabnocci_number call=new Nth_fabnocci_number();
       call.number(a);
     

    }
}
