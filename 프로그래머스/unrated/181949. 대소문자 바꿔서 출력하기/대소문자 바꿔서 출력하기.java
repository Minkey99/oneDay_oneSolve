import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (!isUpperCase(a, i)) {
                result.append(Character.toUpperCase(a.charAt(i)));
            } else if (!isLowerCase(a, i)) {
                result.append(Character.toLowerCase(a.charAt(i)));
            } else {
                result.append(a.charAt(i));
            }
        }
        System.out.println(result.toString());
    }

    public static boolean isUpperCase(String s, int idx){
        if(s.charAt(idx) >='A' && s.charAt(idx) <= 'Z') return true;
        else return false;
    }
    public static boolean isLowerCase(String s, int idx){
        if(s.charAt(idx)>='a' && s.charAt(idx) <= 'z') return true;
        else return false;
    }
}