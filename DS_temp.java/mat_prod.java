import java.util.*;
public class mat_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a order : ");
        int o=sc.nextInt();
        matrix a = new matrix(o);
        matrix b = new matrix(o);
        System.out.println("Enter the elements of matrix 1");
        a.readmat(sc);
        System.out.println("Enter the elements of matrix 2");
        b.readmat(sc);
        matrix c = a.matmultiply(b);
        System.out.println("Matrix 1 : ");
        a.printmat();
        System.out.println("Matrix 2 : ");
        b.printmat();
        System.out.println("Product Matrix : ");
        c.printmat();    
    }
}
class matrix{
    int mat[][];
    int col,row;
    matrix(){
        mat = null;
        col=row=0;
    }
    matrix(int o){
        mat = new int[o][o];
        row=col=o;
    }
    void readmat(Scanner sc){
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                mat[r][c]=sc.nextInt();
            }
        }
    }
    void printmat(){
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        } 
    }
    matrix matmultiply(matrix m){
        matrix p = new matrix(this.row);
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                p.mat[i][j]=0;
                for(int k=0;k<this.row;k++){
                    p.mat[i][j] += this.mat[i][k]*m.mat[j][k];
                }
            }
        }
        return p;
    }
}