import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = num1; i <= num2 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn nằm trong khoảng " + num1 + " đến " + num2 + " là: " + sum);
    }
}
