//제리와 톰
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        final int MOLECULE = Integer.parseInt(st.nextToken());
        final int DENOMINATOR = Integer.parseInt(st.nextToken());
        final int ANSWER_MOLECULE = DENOMINATOR - MOLECULE;
        final int ANSWER_DENOMINATOR = DENOMINATOR;
        bw.write(ANSWER_MOLECULE + " " + ANSWER_DENOMINATOR + "\n");
        
        bw.flush();
		br.close();
		bw.close();
    }
}