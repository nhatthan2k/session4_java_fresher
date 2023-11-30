import java.util.Scanner;

public class LearnBai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng, cột của ma trận vuông: ");
        int row = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][row];

        for(int i=0; i<row; i++) {
            for (int j=0; j<row; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int sum = 0;
        for(int i=0; i<row; i++) {
            for (int j=0; j<row; j++) {
                if (i==j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("tổng đường chéo chính của mảng: " + sum);
    }
}
