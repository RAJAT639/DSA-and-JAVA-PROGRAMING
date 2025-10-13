
    import java.util.Scanner ;
class sum_of_n_natural_no
{
    int print_sum(int n)
    {
        int sum=0;
      
      for(int i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      return sum;
    }
    public static void main(String args[])
    {
        System.out.println("enter a number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       sum_of_n_natural_no call=new sum_of_n_natural_no();
      int  result=call.print_sum(number);
       System.out.println("sum of n natural number is "+result);


    } 
}
    


