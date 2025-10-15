import java.util.Scanner;
public class reverse_of_digits {
    int reverse(int a)
    {
        int r, s=0;
        while (a>0)
        {
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        return s;

    }
        public static void main(String args[])
    {
        int n;
          System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      
    
        reverse_of_digits  call=new reverse_of_digits();
        int result=call.reverse(n);
        System.out.println("reverse number is "+result);



    }
}
