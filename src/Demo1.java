public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("MU vô đối " + i);
        }
        // In ra số chẵn từ 1 - 10
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn " + sum);
    }
}
