import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] score = new int[num];
        double max = 0;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a > max) {
                max = a;
            }
            score[i] = a;
        }

        for (int i = 0; i < num; i++) {
            sum += (score[i] / max) * 100;
        }
        avg = sum/num;
        System.out.println(avg);

    }
}