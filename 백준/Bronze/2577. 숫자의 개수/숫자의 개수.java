import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mul = 1;
        int temp = 0;
        int length = 0;
        int [] num = new int[10];
        for (int i = 0; i < 3; i++) {
            mul *= Integer.parseInt(br.readLine());
        }
        length = String.valueOf(mul).length();

        for (int i = 0; i < length; i++) {
            temp = mul % 10;
            num[temp]++;
            mul /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(num[i]).append("\n");
        }
        System.out.println(sb);
    }
}