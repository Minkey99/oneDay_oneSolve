import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < loop; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max * min);
        sc.close();
    }
}