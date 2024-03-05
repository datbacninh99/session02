import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("======MENU======");
            System.out.println("Món cá nhảy");
            System.out.println("Thịt chó");
            System.out.println("Thịt gà");
            System.out.println("Thoát");
            System.out.println("Mời bạn chọn 1 - 4");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn ăn cá nhảy");
                    break;
                case 2:
                    System.out.println("Mời bạn ăn thịt chó");
                    break;
                case 3:
                    System.out.println("Mời bạn ăn thịt gà");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Biết chữ không?");
            }
        } while(true);
    }
}
