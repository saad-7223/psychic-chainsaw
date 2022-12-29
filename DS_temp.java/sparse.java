import java.util.*;
public class sparse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the row and column value :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sparseMat[][]= new int[row][col];
        System.out.println("Enter the elments of sparse matrix :");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                sparseMat[r][c]=sc.nextInt();
            }
        }
        int size=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(sparseMat[r][c]!=0)
                    size++;   
            }
        }
        int result[][]=new int[3][size];
        //result creation
        int k=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(sparseMat[r][c]!=0){
                    result[0][k]=r;
                    result[1][k]=c;
                    result[2][k]=sparseMat[r][c];
                    k++;
                }    
            }
        }
        //printing result matrix
        System.out.println("Triple Representation : ");
        for(int r=0;r<3;r++){
            if(r==0)System.out.print("Row :\t");
            if(r==1)System.out.print("Column :\t");
            if(r==2)System.out.print("Value :\t");
            for(int c=0;c<size;c++){
                System.out.print(result[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter key : ");
        int key =sc.nextInt();
        int f=0;
        for(int i=0;i<size;i++){
            if(result[2][i]==key){
                System.out.println("Element found at "+result[0][i]+","+result[1][i]);
                f=1;
            }
        }
        if (f==0){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
