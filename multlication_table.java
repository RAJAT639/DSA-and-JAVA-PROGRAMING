
    import java.util.Scanner ;
class multlication_table
{
    void print_table(int n)
    {
        System.out.println("table of "+n);
      for(int i=1;i<=10;i++)
      {
        System.out.println(n+"*"+i+"="+n*i);
      }
    }
    public static void main(String args[])
    {
        System.out.println("enter a number");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       multlication_table call=new multlication_table();
       call.print_table(number);

    } 
}
    

