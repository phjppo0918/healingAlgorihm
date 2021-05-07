import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_T = Integer.parseInt(br.readLine());
        BigInteger tile[] = new BigInteger[NUMBER_OF_T+1];
        tile[0] = new BigInteger("1");
        tile[1] = new BigInteger("1");

        for(int i=2;i<=NUMBER_OF_T;i++) {
            tile[i] = tile[i-1].add(tile[i-2]);
        }
        BigInteger answer = tile[NUMBER_OF_T].add(tile[NUMBER_OF_T-1]);
        answer = answer.multiply(new BigInteger("2"));
        
        bw.append(answer.toString());
        bw.write(sb.toString());
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


