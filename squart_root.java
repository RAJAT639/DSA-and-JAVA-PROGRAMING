// find square root if not perfect then return floor of square root of no.
import java.util.Scanner;

public class squart_root {
    void calculate(float x)
    {
        double y=Math.sqrt(x);
       double r=Math.floor(y);
       System.out.println("Squart root of "+x+" is "+r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        squart_root call=new squart_root();
        call.calculate(n);
    }
}
