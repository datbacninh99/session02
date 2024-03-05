public class BT3 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 2 đến 100 là: ");
        int count = 0;
        int num = 2;
        while (num < 100) {
            boolean flag = true;
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag & num < 100) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("Số lượng số nguyên tố nhỏ hơn 100 là: " + count);
    }
}
