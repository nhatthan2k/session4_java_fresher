import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số phần tử của mảng: ");
        int numArr = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[numArr];

        for (int i=0; i<numArr; i++) {
            System.out.printf("arr[%d]: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập phần tử bạn muốn chèn:");
        int addValue = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập chỉ số bạn muốn chèn:");
        int addIndex = Integer.parseInt(scanner.nextLine());

        int[] newArr = new int[numArr+1];

        for (int i = 0; i<addIndex; i++) {
            newArr[i] = arr[i];
        }

        newArr[addIndex] = addValue;

        for (int i = addIndex+1; i<newArr.length; i++){
            newArr[i] = arr[i-1];
        }

        for (int i = 0; i< newArr.length; i++) {
            System.out.printf("%d ", newArr[i]);
        }
    }
}
