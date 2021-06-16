import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int numberOfMember = Integer.parseInt(br.readLine());
            ArrayList<Member> arrayList = new ArrayList<>();
            for (int i = 0; i < numberOfMember; i++) {
                st = new StringTokenizer(br.readLine());
                int score1 = Integer.parseInt(st.nextToken());
                int score2 = Integer.parseInt(st.nextToken());
                arrayList.add(new Member(score1, score2));
            }

            Collections.sort(arrayList);
            int passCount = numberOfMember;
            int bestScore2 = arrayList.get(0).score2;
            for (int i = 1; i < numberOfMember; i++) {
                if (arrayList.get(i).score2 > bestScore2) {
                    passCount--;
                } else {
                    bestScore2 = arrayList.get(i).score2;
                }
            }
            sb.append(passCount);
            sb.append("\n");

        }


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

class Member implements Comparable<Member> {
    int score1;
    int score2;

    public Member() {
    }

    ;

    public Member(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    public int compareTo(Member member) {
        return this.score1 - member.score1;
    }
}

