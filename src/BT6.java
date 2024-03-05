import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập số: ");
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("======MENU======");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn 1 - 4");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (num % 2 == 0) {
                        System.out.println(num + " là số chẵn");
                    } else {
                        System.out.println(num + " là số lẻ");
                    }
                    break;
                case 2:
                    boolean isPrime = true;
                    for (int i = 2; i < num; i++)
                    {
                        if (num == 2)
                        {
                            System.out.println(num + " là số nguyên tố");
                            break;
                        }
                        if (num % i == 0)
                        {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        System.out.println(num + " là số nguyên tố");
                    } else {
                        System.out.println(num + " không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    if (num % 3 == 0) {
                        System.out.println(num + " chia hết cho 3");
                    } else {
                        System.out.println(num + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Cook!");
            }
        }
    }
}
