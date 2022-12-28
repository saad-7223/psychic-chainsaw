import java.util.*;
public class str {
	public static void main(String[] args){
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");    
		n=sc.nextInt();    
		String[] a = new String[n];  
		System.out.print("Enter the elements of the array: ");  
		for(int i=0; i<n; i++){  
		   a[i]=sc.next();  
		}  
		System.out.print("Sorted array elements are: ");  
		str.getSortedStringArray(a);
        sc.close();
    }
	public static void getSortedStringArray(String[] a) {
		String x[] = a;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareToIgnoreCase(a[j])<0) {
					String temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(x[i]+ " ");
		}
	}
}