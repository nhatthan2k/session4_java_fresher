import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng của mảng:");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số côt của mảng:");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];

        System.out.println("nhập các giá trị của mảng:");
        for (int i=0; i<row; i++) {
            for(int j=0; j<col; j++){
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.printf("\n");

        int sum = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++){
                if(arr[i][j]%2==0){
                    sum+=arr[i][j];
                    System.out.printf("%d\t",arr[i][j]);
                }else {
                    System.out.printf("0\t");
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        System.out.println("tổng giá trị số chẵn trong mảng là: " + sum);
    }
}
