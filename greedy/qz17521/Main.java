import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_DAY = Integer.parseInt(st.nextToken());   
        BigInteger cash = new BigInteger(st.nextToken());
        BigInteger coin = BigInteger.ZERO;
        
        int price[] = new int [NUMBER_OF_DAY];
        for(int i=0;i<NUMBER_OF_DAY;i++) {
            price[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0;i<NUMBER_OF_DAY-1;i++) {
            if(price[i] <= price[i+1]) {
                coin = coin.add( cash.divide(BigInteger.valueOf(price[i])) );
                cash = cash.remainder(BigInteger.valueOf(price[i]));
            }else {
                cash = cash.add( coin.multiply(BigInteger.valueOf(price[i])));
                coin = BigInteger.ZERO;
            }
        }
        cash = cash.add( coin.multiply(BigInteger.valueOf(price[NUMBER_OF_DAY -1])));
        sb.append(cash.toString());
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


