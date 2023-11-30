import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numArr];

        for (int i=0; i<numArr; i++) {
            System.out.printf("arr[%d]: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập chỉ số cần xóa :");
        int deleteIndex = Integer.parseInt(scanner.nextLine());


        for (int i=deleteIndex; i<arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        int[] newArr = new int[arr.length - 1];

        for (int i=0; i<newArr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i< newArr.length; i++) {
            System.out.printf("%d ", newArr[i]);
        }
    }
}
