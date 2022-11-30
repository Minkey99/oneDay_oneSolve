import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = 0;
        int num = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < loop; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max * min);
    }
}