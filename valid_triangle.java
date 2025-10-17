import java.util.Scanner;
public class valid_triangle {
    void check(int m,int n,int p)
    {
        if(m+n>p&&m+p>n&&p+n>m)
        {
            System.out.println("triangle is valid");
        }
        else
        System.out.println("triangle not valid");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        valid_triangle call=new valid_triangle();
        call.check(a,b,c);
    }
    
}
