import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        ArrayList<Queue<String>> arrayList = new ArrayList<>();
        final int NUMBER_OF_BIRD = Integer.parseInt(br.readLine());
        for (int i = 0; i < NUMBER_OF_BIRD; i++) {
            Queue<String> temp = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                temp.add(st.nextToken());
            }
            arrayList.add(temp);
        }
        String word[] = br.readLine().split(" ");
        boolean notExist = false;
        for (int i = 0; i < word.length; i++) {
            int j;
            for (j = 0; j < NUMBER_OF_BIRD; j++) {
                if (arrayList.get(j).isEmpty()) {
                    continue;
                }
                if (arrayList.get(j).peek().equals(word[i])) {
                    arrayList.get(j).poll();
                    break;
                }
            }
            if (j == NUMBER_OF_BIRD) {
                notExist = true;
                break;
            }
        }
        for (int i = 0; i < NUMBER_OF_BIRD; i++) {
            if (!arrayList.get(i).isEmpty()) {
                notExist = true;
                break;
            }
        }
        if (notExist) {
            sb.append("Impossible");
        } else {
            sb.append("Possible");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


