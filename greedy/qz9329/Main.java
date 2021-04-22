import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            int maxMoney = 0;
            st = new StringTokenizer(br.readLine());
            int numberOfMoneyCase = Integer.parseInt(st.nextToken());
            int numberOfStiker = Integer.parseInt(st.nextToken());
            for(int j=0;j<numberOfMoneyCase;j++) {
                
            }
            
            
            sb.append(maxMoney);
            sb.append("\n"); 
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}
class Money {
    int coin[];
    int price;
}

