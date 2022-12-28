import java.util.Scanner;
public class gauss {
    public static void convertToDiagonal(float[][] a, int n) {
		float ratio;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j < n; j++) {
				if(j != i) {
					ratio = a[j][i] / a[i][i];
					for(int k = 0; k < n + 1; k++) {
						a[j][k] -= ratio * a[i][k];
					}
					System.out.println("Intermediate forms:");
					for(int x = 0; x < n; x++) {
						for(int y = 0; y < n + 1; y++) {
							System.out.printf("%f ", a[x][y]);
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}
	}

	public static void printUnknowns(float[][] a, int n) {
		System.out.println("Values of unknowns are:");
		for(int i = 0; i< n; i++) {
			System.out.printf("Value of Variable %d=%f\n", i, a[i][n] / a[i][i]);
		}
	}

	public static void main(String[] args) {
		//int i, j, k, x, y;
		//float ratio;
		System.out.println("Enter no of Unknowns");
		int n = STDIN_SCANNER.nextInt();
		float[][] a = new float[n][n + 1];
		System.out.println("Enter the Augmented Matrix");
		for(int i2 = 0; i2 < n; i2++) {
			for(int j2 = 0; j2 < n + 1; j2++) {
				a[i2][j2] = STDIN_SCANNER.nextFloat();
			}
		}
		convertToDiagonal(a, n);
		printUnknowns(a, n);
	}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
