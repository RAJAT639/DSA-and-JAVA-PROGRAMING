import java.util.Scanner;
public class digital_root {
    int sum(int a)
    {
            int r;
       
int c=0;
        while(a>0||c>9)
        {
            if(a==0)
            {
            a=c;
            c=0;
        }
            r=a%10;
            c=c+r;
            a=a/10;
            
    }
    
    return c;    
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
       digital_root call=new digital_root();
       
        System.out.println("digital root of number  is "+call.sum(x));
    }
}
