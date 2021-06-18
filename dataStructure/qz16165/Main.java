import java.math.BigInteger;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_GROUP = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_QUIZ = Integer.parseInt(st.nextToken());
        HashMap<String, String> groupSeacher = new HashMap<>();
        HashMap<String, ArrayList<String>> memberListMap = new HashMap<>();

        for (int groupCount = 0; groupCount < NUMBER_OF_GROUP; groupCount++) {
            ArrayList<String> memberList = new ArrayList<>();
            String groupName = br.readLine();
            int numberOfMember = Integer.parseInt(br.readLine());
            for (int i = 0; i < numberOfMember; i++) {
                String member = br.readLine();
                groupSeacher.put(member, groupName);
                memberList.add(member);
            }
            Collections.sort(memberList);
            memberListMap.put(groupName, memberList);
        }

        for (int quizCount = 0; quizCount < NUMBER_OF_QUIZ; quizCount++) {
            String quizInput = br.readLine();
            char quizType = br.readLine().charAt(0);
            if (quizType == '1') {
                sb.append(groupSeacher.get(quizInput));
                sb.append("\n");
            } else {
                ArrayList<String> members = memberListMap.get(quizInput);
                for (String k : members) {
                    sb.append(k);
                    sb.append("\n");
                }

            }
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




