
import java.util.Scanner;

public class decimal_to_binary {
    void conversion(int x)
    {
     int s[]=new int[100];    
     int i=0;
     while(x>0)
        {
        
            s[i]=x%2;
            i++;
            x=x/2;

        }
        for (int j=i-1;j>=0;j--)
        {
            System.out.print(s[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();
 decimal_to_binary call=new decimal_to_binary();
        System.out.println("Binary number of "+a+" is ");
  call.conversion(a);


    }
    
}
