import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("======MENU======");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn 1 - 4");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài: ");
                    double dai = scanner.nextDouble();
                    System.out.println("Nhập chiều rộng: ");
                    double rong = scanner.nextDouble();
                    double chuVi = (dai + rong) * 2;
                    System.out.println("Chu vi hình chữ nhật là: " + chuVi);
                    double dienTich = dai * rong;
                    System.out.println("Diện tích hình chữ nhật là: " + dienTich);
                    break;
                case 2:
                    System.out.println("Nhập cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.println("Nhập cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.println("Nhập cạnh c: ");
                    double c = scanner.nextDouble();
                    double p = (a + b + c) / 2;
                    System.out.println("Chu vi tam giác là: " + p);
                    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Diện tích tam giác là: " + area);
                    break;
                case 3:
                    System.out.print("Nhập bán kính hình tròn: ");
                    double r = scanner.nextDouble();
                    double chuViHinhTron = 2 * Math.PI * r;
                    double dienTichHinhTron = Math.PI * Math.pow(r, 2);
                    System.out.println("Chu vi hình tròn là: " + chuViHinhTron);
                    System.out.println("Diện tích hình tròn là: " + dienTichHinhTron);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Cook!");
            }
        }
    }
}