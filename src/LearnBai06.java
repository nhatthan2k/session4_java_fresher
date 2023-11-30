import java.util.Scanner;

public class LearnBai06 {
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

        System.out.println("nhập số cột cần tính: ");
        int colIndex = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for(int i=0; i<row; i++) {
            sum += arr[i][colIndex];
        }

        System.out.printf("tổng các phần tử ở cột %d là %d", colIndex, sum);
    }
}
