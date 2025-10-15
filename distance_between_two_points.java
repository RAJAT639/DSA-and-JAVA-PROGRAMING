import java.util.Scanner;
public class distance_between_two_points {
    double distance_calculate(int a1, int b1, int a2, int b2)
    {
        double x=Math.pow((a2-a1),2);
        double y=Math.pow((b2-b1),2);
        double z=Math.sqrt(x+y);
        return z;
    }

    public static void main(String args[])
    {
        int x1,x2,y1,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first point");
        x1=sc.nextInt();
        y1=sc.nextInt();
         System.out.println("enter a second point");
     x2= sc.nextInt();
        y2=sc.nextInt();
    distance_between_two_points call=new distance_between_two_points();
   double distance =call.distance_calculate(x1,y1,x2,y2);
   System.out.println("Distance between two number is "+distance);


    }
    
}
