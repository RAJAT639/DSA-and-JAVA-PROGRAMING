import java.util.Scanner;
public class prime_number_check {
void check(int n)
{
        int count=0;
for(int i=2;i<=n/2;i++)
{
    count++;
}
if(count==0)
    {
        System.out.println("number is  prime");
    }
    else{
        System.out.println("number is not prime");
    }
}
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter a number");
     int a=sc.nextInt();
     prime_number_check call=new prime_number_check();
       call.check(a);
        }
}
