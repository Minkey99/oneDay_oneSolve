import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        for (int a = 0; a < loop; a++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int loop2 = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            for (int b = 0; b < word.length(); b++) {
                sb.append(String.valueOf(word.charAt(b)).repeat(Math.max(0, loop2)));
            }
            System.out.println(sb);
        }
    }
}