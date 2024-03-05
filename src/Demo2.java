import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d * %d = %d \n", i, j, i * j);
            }
        }
    }
}