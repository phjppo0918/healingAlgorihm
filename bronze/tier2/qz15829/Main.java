import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int LENGTH = Integer.parseInt(br.readLine());
        String str = br.readLine();
       //StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger answer = new BigInteger("0");
        BigInteger hashCode = new BigInteger("1");
        BigInteger multi = new BigInteger("31");
        BigInteger temp;
        for(int i=0;i<LENGTH;i++) {
            int alpa = str.charAt(i) - 'a' + 1;
            temp = BigInteger.valueOf(alpa);
            answer = answer.add(temp.multiply(hashCode));
            hashCode = hashCode.multiply(multi);
        }
        bw.write(answer+"\n");
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}