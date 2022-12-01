import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder num = new StringBuilder(br.readLine());
            String nNum = num.toString();
            String reverseNum = num.reverse().toString();
            boolean check = true;
            if (reverseNum.equals("0")) {
                break;
            }
            for (int i = 0; i < num.length(); i++) {
                if (nNum.charAt(i) != reverseNum.charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}