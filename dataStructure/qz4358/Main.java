import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int totalCount = 0;
        do {
            String treeTemp = br.readLine();
            hashMap.put(treeTemp, hashMap.getOrDefault(treeTemp, 0) + 1);
            totalCount++;
        }
        while (br.ready());
        ArrayList<String> treeName = new ArrayList<>(hashMap.keySet());
        Collections.sort(treeName);
        for (String k : treeName) {
            sb.append(k);
            sb.append(" ");
            sb.append(String.format("%.4f\n", (double) hashMap.get(k) * 100 / totalCount));
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}




