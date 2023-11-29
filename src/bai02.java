import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâp số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        float[] arr = new float[numArr];

        System.out.println("nhập giá trị của mảng: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = Float.parseFloat(scanner.nextLine());
        }

        float sum=0;
        for (int i = 0; i<arr.length; i++) {
            sum +=arr[i];
        }

        System.out.println("trung bình cộng các giá trị của mảng: " + sum/arr.length);
    }
}
