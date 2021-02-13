//홍익대학교
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int INPUT_YEARS = Integer.parseInt(st.nextToken());
        final int HONGIK_YEARS = 1946;
        final int ANSWER = INPUT_YEARS - HONGIK_YEARS;
        bw.write(ANSWER + "\n");
        
        bw.flush();
		br.close();
		bw.close();
    }
}