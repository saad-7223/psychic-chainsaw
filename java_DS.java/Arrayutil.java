import java.util.Arrays;
public class Arrayutil {
    public static void main(String [] args){
        int[] arr = {6,0,5,0,0,1,3};
        /*for(int i =0;i<arr.length;i++){
            if (arr[i]==0 && arr[i+1]!=0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/
        //System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
