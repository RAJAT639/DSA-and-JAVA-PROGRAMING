import java.util.Scanner;

public class palendrome_number {
    void check(int a)
    {
     int x=a;
     int s=0;
     while(x>0)
     {
        s=s*10+x%10;
        x=x/10;
     }
              if (s==a)
                System.out.println("given no is palendrome");
            else
                                System.out.println("given no is not palendrome");

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no ");
        int n=sc.nextInt();
        palendrome_number call=new palendrome_number();
        call.check(n);
    }
}
