import java.util.Scanner;
public class sqroot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = sc.nextDouble();
        double ep= 1.0e-15;
        double x=a;
        while(Math.abs(x-a/x) > ep*x){
            x=(x+a/x)/2.0;
        }
        System.out.println("The square root of "+a+" = "+x);
        sc.close();
    }
}
