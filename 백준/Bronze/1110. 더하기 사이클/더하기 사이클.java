import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] num = new int[2];
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            n = Integer.parseInt(String.valueOf(n).concat("0"));
        }
        int f = n;
        while (true) {
            for (int i = 0; i< 2; i++) {
                num[i] = n%10;
                n /= 10;
            }

            int sum = num[0] + num[1];

            n = Integer.parseInt(String.valueOf(num[0]).concat(String.valueOf(sum%10)));

            if (n == f) {
                break;
            }
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}