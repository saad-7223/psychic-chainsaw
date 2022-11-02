import java.util.Scanner;
public class employee {
    public static void main(String [] args){
        String n;int i;
        String r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name : ");
        n = sc.nextLine();
        System.out.println("Enter employee id : ");
        i =sc.nextInt();
        System.out.println("Enter employee department : ");
        r= sc.nextLine();
        sc.close();
        Emp e1 = new Emp(n,i,r);
        e1.display();
    }
}
class Emp{
    String name;
    int id;
    String role;
    Emp(String n,int i,String r){
        name = n;
        id = i;
        role = r;
    }
    public void display(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id :"+id);
        System.out.println("Employee department :"+role);
        System.out.println();
    }
}
