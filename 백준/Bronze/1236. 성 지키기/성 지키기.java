import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        char[][] arr = new char[x][y];

        int row = 0, col = 0;

        for (int a = 0; a < x; a++) {
            String line = br.readLine();
            for (int b = 0; b < y; b++) {
                arr[a][b] = line.charAt(b);
            }
        }

        for (int a = 0; a < x; a++) {
            boolean flag = true;
            for (int b = 0; b < y; b++) {
                if (arr[a][b] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                row++;
            }
        }

        for (int b = 0; b < y; b++) {
            boolean flag = true;
            for (int a = 0; a < x; a++) {
                if (arr[a][b] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                col++;
            }
        }

        System.out.println(Math.max(row, col));
    }
}