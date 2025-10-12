import java.util.Scanner ;
class evenodd
{
    void check(int n)
    {
      if (n%2==0)
      System.out.println("number is even");
      else
    System.out.println("number is odd");
    }
    public static void main(String args[])
    {
        System.out.println("enter a number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       evenodd call=new evenodd();
       call.check(number);

    } 
}