import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_MEMBER = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> member = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MEMBER; i++) {
            member.add(Integer.parseInt(st.nextToken()));
        }
        Integer lowestMember = NUMBER_OF_MEMBER;
        int answer = 0;
        while (lowestMember != 1) {
            int lowestMemberIndex = member.indexOf(lowestMember);
            int gapTemp;
            if (lowestMemberIndex == 0) {
                gapTemp = member.get(lowestMemberIndex) - member.get(1);
            } else if (lowestMemberIndex == member.size() - 1) {
                gapTemp = member.get(lowestMemberIndex) - member.get(member.size() - 2);
            } else {
                if (member.get(lowestMemberIndex - 1) > member.get(lowestMemberIndex + 1)) {
                    gapTemp = member.get(lowestMemberIndex) - member.get(lowestMemberIndex - 1);
                } else {
                    gapTemp = member.get(lowestMemberIndex) - member.get(lowestMemberIndex + 1);
                }
            }
            member.remove(lowestMemberIndex);
            lowestMember--;
            answer += gapTemp;
        }

        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}