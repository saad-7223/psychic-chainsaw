import java.util.Scanner;
interface arithemetic{
    int operation(int a,int b);
}
public class in_math {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        arithemetic add = (int a,int b)->a+b;
        System.out.println("Addition : "+add.operation(x,y));
        arithemetic sub = (int a,int b)->a-b;
        System.out.println("Subtraction : "+sub.operation(x,y));
        arithemetic prod = (int a,int b)->a*b;
        System.out.println("Multiplication : "+prod.operation(x,y));
        arithemetic div = (int a,int b)->a/b;
        System.out.println("Divsion : "+div.operation(x,y));
        sc.close();
    }
}
