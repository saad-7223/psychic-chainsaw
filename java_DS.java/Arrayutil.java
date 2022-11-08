import java.util.Arrays;
public class Arrayutil {
    public static void main(String [] args){
        int[] arr = {2,4,1,8,6,3,7};
        /*int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }*/
        int n=arr.length+1;//Finding the missing number
        int sum = (n*(n+1))/2;
        for(int num:arr){
            sum-=num;
        }
        System.out.println(sum);
    }
}
