import java.util.Scanner;

public class Learnbai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i=0; i<5; i++) {
            System.out.printf("arr[%d]: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = arr[0];
        int max2 = arr[0];

        for (int i=0; i<5; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] > max2 && max2<max) {
                max2 = arr[i];
            }
        }

        System.out.println("giá trị nhỏ thứ 2 trong mảng là:" + max2);
    }
}
