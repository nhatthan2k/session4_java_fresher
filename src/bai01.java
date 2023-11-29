import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("nhập giá trị mảng:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("mảng của tôi là: ");
        for (int i=0;i<5;i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
