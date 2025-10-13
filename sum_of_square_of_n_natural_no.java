import java.util.Scanner;

public class sum_of_square_of_n_natural_no {
     double print_sum(int n)
    {
        double sum=0;
      
      for(int i=1;i<=n;i++)
      {
        sum=sum+Math.pow(i,2);
      }
      return sum;
    }
    public static void main(String args[])
    {
        System.out.println("enter a number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       sum_of_square_of_n_natural_no call=new sum_of_square_of_n_natural_no();
      double  result=call.print_sum(number);
       System.out.println("sum of square n natural number is "+result);


    } 
    
}
