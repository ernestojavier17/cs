package searching.bitwise;

import java.util.Scanner;

/**
 * Problem: https://www.hackerrank.com/challenges/acm-icpc-team/problem
 */
public class ACMICPCTeam {

    int[] acmTeam(String[] topic) {
        // Complete this function
        int[] ans = new int[2];

        int maxVal = -1;
        int nbTeams = 0;

        for (int i = 0; i < topic.length; i++) {
            int teamA = Integer.parseInt(topic[i].trim(), 2);
            for(int j=i+1; j<topic.length; j++) {
                int teamB = Integer.parseInt(topic[j].trim(), 2);
                int r = teamA | teamB;
                if(r > maxVal) {
                    maxVal = r;
                    nbTeams++;
                }
            }
        }
        ans[0] = Integer.bitCount(maxVal);
        ans[1] = nbTeams;
        return ans;
    }

    public static void main(String[] args) {
        ACMICPCTeam t = new ACMICPCTeam();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int[] result = t.acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
