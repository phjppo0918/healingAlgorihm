import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_NUMBER = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(st.nextToken());
        
        int number[] = new int [NUMBER_OF_NUMBER+1];
        int numStack[] = new int [NUMBER_OF_NUMBER+1];

        st = new StringTokenizer(br.readLine());
        number[1] = Integer.parseInt(st.nextToken());
        numStack[1] = number[1];
        
        for(int i=2;i<=NUMBER_OF_NUMBER;i++) {
            number[i] = Integer.parseInt(st.nextToken());
            numStack[i] = number[i] + numStack[i-1];
        }
        int start, finish;
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            finish = Integer.parseInt(st.nextToken());
            int answer = numStack[finish] - numStack[start-1];
            
            sb.append(answer);
            sb.append("\n");

        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


