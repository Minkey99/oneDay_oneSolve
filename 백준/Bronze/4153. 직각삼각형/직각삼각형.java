import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arrayList = new ArrayList<>();

            while (st.hasMoreTokens()) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }

            arrayList.sort(Comparator.naturalOrder());

            int a = arrayList.get(0);
            int b = arrayList.get(1);
            int c = arrayList.get(2);


            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if ((a == b && b == c) || ((int) Math.pow(c, 2) == (int) Math.pow(b, 2) + (int) Math.pow(a, 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}