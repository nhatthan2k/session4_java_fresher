import java.util.Scanner;

public class LearnBai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chuỗi: ");
        String inputStr = scanner.nextLine();

        System.out.println("nhâp kí tự cần tìm kiếm: ");
        char str = scanner.nextLine().charAt(0);

        int k = 0;
        for (int i=0; i<inputStr.length(); i++) {
            if(inputStr.charAt(i) == str) {
                k++;
            }
        }

        System.out.printf("số lần xuất hiện của %S là %d", str, k);
    }
}
