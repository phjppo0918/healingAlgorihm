import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_PRODUCT = Integer.parseInt(br.readLine());
        int product[]  = new int [NUMBER_OF_PRODUCT];
        for(int i=0;i<NUMBER_OF_PRODUCT;i++) {
            product[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(product);
        int saleTime = 0;
        int answer = 0;
        for(int i=NUMBER_OF_PRODUCT-1;i>-1;i--) {
            saleTime++;
            if(saleTime==3) {
                saleTime = 0;
                continue;
            }
            
            answer += product[i];
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


