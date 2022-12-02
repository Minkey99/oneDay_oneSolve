import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        String num = sb.toString();
        String num2 = sb.reverse().toString();
        boolean flag = false;
        int fSum = 1;

        for (int a = 0; a < num.length() - 1; a++) {
            int sum = 1;
            fSum *= Character.getNumericValue(num.charAt(a));
            for (int b = a + 1; b < num.length(); b++) {
                sum *= Character.getNumericValue(num.charAt(b));
            }
            if (fSum == sum) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}