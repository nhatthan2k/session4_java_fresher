import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số dòng của mảng: ");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("giá trị của mảng: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
