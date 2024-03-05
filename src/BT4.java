import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 2;
        int count = 0;
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên");
        while(count < 20) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
