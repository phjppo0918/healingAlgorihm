import java.util.*;

import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        int number_of_join = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_STUDENT = Integer.parseInt(st.nextToken());
        for (int i = 0; i < NUMBER_OF_STUDENT; i++) {
            String temp = br.readLine();
            if (linkedHashSet.contains(temp)) {
                linkedHashSet.remove(temp);
            }
            linkedHashSet.add(temp);
        }
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append("\n");
            if (--number_of_join == 0) break;
        }


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


