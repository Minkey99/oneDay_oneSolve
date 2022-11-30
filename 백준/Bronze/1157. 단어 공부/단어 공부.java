import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int[] e = new int[27];

        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A';
            e[index]++;
        }

        int max = Arrays.stream(e).max().getAsInt();
        int count = (int) Arrays.stream(e).filter(a -> a == max).count();
        if (count > 1) {
            System.out.println("?");
            return;
        }
        int max2 = IntStream.range(0, e.length).filter(b -> max == e[b]).findFirst().getAsInt() + (int) 'A';
        char c = (char) max2;
        System.out.println(c);
        
        sc.close();
    }
}