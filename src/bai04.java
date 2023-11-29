import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numArr];

        System.out.println("nhập giá trị của mảng: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = arr[0];
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }

            if (max<arr[i]) {
                max = arr[i];
            }
        }

        System.out.printf("%d là giá trị nhỏ nhất, %d là giá trị lớn nhất\n", min, max);
    }
}
