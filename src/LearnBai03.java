import java.util.Scanner;

public class LearnBai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâp số phần tử của mảng 1: ");
        int numArr1 = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[numArr1];

        System.out.println("nhập giá trị của mảng 1: ");
        for (int i=0; i<arr1.length; i++) {
            System.out.printf("arr1[%d]: ", i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhâp số phần tử của mảng 2: ");
        int numArr2 = Integer.parseInt(scanner.nextLine());

        int[] arr2 = new int[numArr2];

        System.out.println("nhập giá trị của mảng 2: ");
        for (int i=0; i<arr2.length; i++) {
            System.out.printf("arr[%d]: ", i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] newArr = new int[arr1.length+arr2.length];

        for (int i = 0; i<arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = arr1.length; i<newArr.length; i++) {
            newArr[i] = arr2[i - arr1.length];
        }

        System.out.println("mảng sau khi gộp là: ");
        for (int i=0; i<newArr.length;i++) {
            System.out.printf("%d\t", newArr[i]);
        }
    }
}
