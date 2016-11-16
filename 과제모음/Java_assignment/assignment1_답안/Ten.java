import java.util.Scanner;

public class Ten {
	public static void main(String[] args) {
		int boxSize;
		int number = 1;
		int i, j;
		int[][] list;
        System.out.printf("input boxSize: ");
        boxSize = (new Scanner(System.in)).nextInt();

		list = new int[boxSize][boxSize];

		//initialize
		for ( i = 0; i < boxSize; i++ ){
			for ( j = 0; j < boxSize; j++ ){
				list[i][j] = 0;
			}
		}

		for ( i = 0; i < boxSize; i++ ){
			for ( j = i; j < boxSize-i; j++ ){
				list[i][j] = number++;
			}

			for ( j = i+1; j < boxSize-i; j++ ){
				list[j][boxSize-(i+1)] = number++;
			}

			for ( j = boxSize - (i+2); j >= i; j--){
				list[boxSize-(i+1)][j] = number++;
			}

			for ( j = boxSize-(i+2); j > i; j-- ){
				list[j][i] = number++;
			}

		}

		for ( i = 0; i < boxSize; i++ ){
			for ( j = 0; j < boxSize; j++ ){
				System.out.print(list[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
