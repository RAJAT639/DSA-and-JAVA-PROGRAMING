import java.util.Scanner;
public class pair_cube_count {
    void count(int x)
     {
        int s=0;
       for(int a=1;a<=x;a++)
        {
            for (int b = 0; b <=x; b++) {
                if(a*a*a+b*b*b==x)
       { 
                    s=s+1;
                System.out.println(a+" and "+b+" pair of cube");
            }
        } 
      }
    }
    public static void main(String args[])
     {
        Scanner sc =new Scanner(System.in);
        System.err.println("enter a no");
        int n=sc.nextInt();
        pair_cube_count call=new pair_cube_count();
        call.count(n);

     }
}

