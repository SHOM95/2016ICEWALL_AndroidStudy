import java.util.Scanner;

public class Nine{
    public static void main(String[] args){
        int height;
        int i, j;

        height = (new Scanner(System.in)).nextInt();

        //Increase
        for ( i = 0; i < height; i++ ){
            for(j = height - (i+1); j > 0; j-- ){
                System.out.printf(" ");
            }

            for(j = 0; j < (i+1)*2 - 1; j++ ){
                System.out.printf("*");
            }
            System.out.println();
        }

        //Decrease
        for ( i = height-1; i >= 0; i-- ){
            for ( j = 0; j < height - i; j++ ){
                System.out.printf(" ");
            }

            for ( j = 2*i-1; j > 0; j-- ){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
