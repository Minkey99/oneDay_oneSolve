import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int loop = Integer.parseInt(br.readLine());
        ArrayList<teamName> arrayList = new ArrayList<>();
        int L = 0, O = 0, V = 0, E = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'L') {
                L++;
            }
            if (name.charAt(i) == 'O') {
                O++;
            }
            if (name.charAt(i) == 'V') {
                V++;
            }
            if (name.charAt(i) == 'E') {
                E++;
            }
        }

        for (int x = 0; x < loop; x++) {
            teamName teamName = new teamName(L, O, V, E, br.readLine());
            arrayList.add(teamName);
        }

        arrayList.sort(new Comparator<teamName>() {
            @Override
            public int compare(teamName o1, teamName o2) {
                if (o1.mod < o2.mod) {
                    return 1;
                } else if (o1.mod == o2.mod) {
                    return o1.team.compareTo(o2.team);
                } else {
                    return -1;
                }
            }
        });

        System.out.println(arrayList.get(0).team);
    }
}

class teamName {
    int L, O, V, E;
    String team;
    int mod = 0;

    public teamName(int l, int o, int v, int e, String team) {
        this.L = l;
        this.O = o;
        this.V = v;
        this.E = e;
        this.team = team;
        this.mod = cal(team);
    }

    public int cal(String team) {
        for (int i = 0; i < team.length(); i++) {
            if (team.charAt(i) == 'L') {
                L++;
            }
            if (team.charAt(i) == 'O') {
                O++;
            }
            if (team.charAt(i) == 'V') {
                V++;
            }
            if (team.charAt(i) == 'E') {
                E++;
            }
        }
        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }
}