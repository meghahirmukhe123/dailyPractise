import java.util.Scanner;

public class SprialNumberPrinting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter row of matrix: ");
		int row = sc.nextInt();
		System.out.println("enter col of matrix: ");
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];
		System.out.println("enter elements in matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("matrix is: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 1) {
					j = j + 2;

					if (i == 2) {
						j = 1;
					}

				}

				System.out.print(matrix[i][j] + " ");
			}

		}

	}

}
