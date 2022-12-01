import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        double num = 0;

        for (int i = 0; i < 5; i++) {
            num = Double.parseDouble(st.nextToken());
            num = (int) Math.pow(num,2);
            sum += num;
        }
        int num2 = sum%10;

        System.out.println(num2);

        br.close();
    }
}