import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;
        
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        
        for(int i=0; i<NUMBER_OF_TESTCASE;i++) {
            int input = Integer.parseInt(br.readLine());
            
            sb.append(input/QUARTER);
            sb.append(" ");
            input %= QUARTER;
            
            sb.append(input/DIME);
            sb.append(" ");
            input %= DIME;
            
            sb.append(input/NICKEL);
            sb.append(" ");
            input %= NICKEL;
            
            sb.append(input);
            sb.append("\n");
            
        }
        
        
        
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


