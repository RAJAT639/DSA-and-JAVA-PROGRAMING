import java.util.Scanner;
class power_check{
    void check(int n,int s)
    {
        int t=0;
        int i=0;
        int count =0;
      while(t<s)
        {
          t=(int)Math.pow(n,i);
          if (t==s)
          {
            count++;
          }
          i++;
        }
        if(count>0)
        System.out.println(s+" is power of "+n);
        else
        System.out.println(s+" is not a power of "+n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("enter checking power number value ");
        int v=sc.nextInt();
        power_check call=new power_check();
        call.check(a,v);

    }
}