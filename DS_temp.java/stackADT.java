import java.util.Scanner;
public class stackADT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stack size : ");
        int n = sc.nextInt();
        stack arr = new stack(n);
        boolean f = true;
        while(f){
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.exit");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter a element : ");
                int ele = sc.nextInt();
                if(arr.push(ele)){
                    System.out.println("Element "+ele+" pushed successfully");
                }else{
                    System.out.println("Stack Overflow");
                }
                break;
                case 2:
                ele = arr.pop();
                if (ele==-1){
                    System.out.println("Stack underflow");
                }else{
                    System.out.println(ele+"poped succesfully");
                }break;
                case 3:
                System.out.println("Stack contents : ");
                arr.print();
                break;
                case 4 :
                f=false;
                break;
                default:
                System.out.println("Invalid choice ");
            }
        }   
        sc.close(); 
    }
}
class stack{
    int top;
    int a[];
    int maxSize;
    stack(int s){
        top = -1;
        a = new int[s];
        maxSize = s;
    }
    boolean isFull(){
        return (top>=(maxSize-1));
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean push(int x){
        if(isFull()){
            return false; 
        }else{
            a[++top]=x;
            return true;
        }
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }else{
            return a[top--];
        }
    }
    void print(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i =top;i>-1;i--){
                System.out.println(a[i]);
            }
        }
    }
}
/*
boolean isEmpty(){
    return (top<0)
}
boolean isFull(){
    return (top>=(maxsize-1))
}
boolean push(int x){
    if(isFull()){
        return false
    }else{
        a[++top]=x;
        return true;
    }
}
int pop(){
    if(isEmpty){
        return -1;
    }else{
        return a[top--];
    }
}
void display(){
    if(isEmpty){
        sopln("stack empty")
    }else{
        for(int i=top;i>-1;i--){
            sopln(a[i])
        }
    }
}
 */
