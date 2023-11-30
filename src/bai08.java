import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numArr];

        for (int i=0; i<numArr; i++) {
            System.out.printf("arr[%d]: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập giá trị update:");
        int updateValue = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập chỉ số update:");
        int updateIndex = Integer.parseInt(scanner.nextLine());

        arr[updateIndex] = updateValue;

        for (int i=0; i<numArr; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
