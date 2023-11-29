import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâp số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numArr];

        System.out.println("nhập các giá trị của mảng: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập giá trị cần tìm kiếm:");
        int findNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        System.out.printf("trị số các số có giá trị %d trong mảng: ", findNumber);
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == findNumber) {
                sum += arr[i];
                System.out.printf("%d,", i);
            }
        }

        System.out.printf("\ntổng các số có giá trị %d là: %d", findNumber, sum);
    }
}
