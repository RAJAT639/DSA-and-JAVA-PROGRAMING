import java.util.Scanner ;
class swap_two_no
{
    void swap(int n1,int n2)
    {
        int z;
        z=n1;
        n1=n2;
        n2=z;
      System.out.println("number after swap");
        System.out.println("a="+n1);
       System.out.println("b="+n2);
      
    }
    public static void main(String args[])
    {
        System.out.println("enter a two number");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("number before swap");
       System.out.println("a="+a);
       System.out.println("b="+b);
       swap_two_no call=new swap_two_no();
       call.swap(a,b);

    } 
}