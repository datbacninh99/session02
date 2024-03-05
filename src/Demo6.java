import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên bất kỳ: ");
        int num = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("======MENU======");
            System.out.println("1. Tìm số ước của số vừa nhập");
            System.out.println("2. Tính tổng các số ước đó");
            System.out.println("3. Tìm các số chia hết cho 3 trong khoảng từ 1 - n (n là số vừa nhập)");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn 1 - 4");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                            System.out.println("Số ước của " + num + " là: " + i);
                        }
                    }
                    break;
                case 2:
                    int sum = 0;
                    for(int i = 1; i <= num; i++) {
                        if(num % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tổng của số ước vừa nhập là: " + sum);
                    break;
                case 3:
                    for(int i = 1; i <= num ; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println("Các số chia hết cho 3 và 5 trong khoảng 1 - " + num + " là : " + i);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while(true);
    }
}
