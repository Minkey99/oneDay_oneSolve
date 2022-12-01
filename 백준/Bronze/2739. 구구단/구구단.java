import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 9; i++) {
            sb.append(num).append(" * ").append(i).append(" = ").append(num*i).append("\n");
        }

        System.out.println(sb);
    }
}