import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("======MENU======");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn 1 - 5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 6; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Cook!");
            }
        } while(true);
    }
}