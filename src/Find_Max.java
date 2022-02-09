import java.util.Scanner;

public class Find_Max {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row you want to create: ");
        row = sc.nextInt();
        System.out.println("Enter the number of column you want to create: ");
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        int max = arr[0][0];
        int rowpos = 0;
        int colpos = 0;

        for(int i = 0; i<row; i++){
            for(int j=0; j<row; j++){
                System.out.println("Enter a value for row #" + i + ", column #" + j);
                int value = sc.nextInt();
                arr[i][j] = value;
            }
        }
        for(int i = 0; i<row; i++) {
            for (int j = 0; j < row; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                    rowpos = i;
                    colpos = j;
                }
            }
        }
        System.out.println("The highest value is " + max + ", found at row #" + rowpos + ", column #" + colpos);
    }
}
