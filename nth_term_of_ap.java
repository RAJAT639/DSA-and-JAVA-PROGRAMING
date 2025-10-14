import java.util.Scanner;
public class nth_term_of_ap {
    int nth_term(int x,int y,int n)
    {
        int r=x+(n-1)*y;
        return r;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter a first term");
     int a=sc.nextInt();
     System.out.println("enter a common difference");
     int d=sc.nextInt();
     System.out.println("enter a nth no");
     int c=sc.nextInt();
     nth_term_of_ap call=new nth_term_of_ap();
      int result =call.nth_term(a,d,c);
      System.out.println("nth term of ap is"+result);


    }
}
