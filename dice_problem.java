import java.util.Scanner;
public class dice_problem {
    int opposite_side(int z)
    {
        int s=7-z;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a dice side number");
        int a=sc.nextInt();
        dice_problem call=new dice_problem();
       int side= call.opposite_side(a);
       System.out.println("apposite side of dice is "+side);

    }
    
}
