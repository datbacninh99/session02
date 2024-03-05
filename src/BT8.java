import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2;
                System.out.println("Chu vi tam giác là: " + p);
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Diện tích tam giác là: " + area);
            } else {
                System.out.println("Đây không phải là 3 cạnh của một tam giác. Vui lòng nhập lại!");
            }
        }
    }
}