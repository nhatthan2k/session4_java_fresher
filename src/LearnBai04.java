import java.util.Scanner;

public class LearnBai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng của mảng:");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số cột của mảng:");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int min = arr[0][0];
        int max = arr[0][0];

        for(int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (arr[i][j] < min ) {
                    min = arr[i][j];
                }

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.printf("%d là min của mảng, %d là max của mảng", min, max);
    }
}
