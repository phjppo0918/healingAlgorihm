import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        String input = br.readLine();
        boolean isZero = true;
        if(input.charAt(0) == '1') {
            isZero = false;
        }
        int countGoOne = 0;
        int countGoZero = 0;
        for(int i=1;i<input.length();i++) {
            if(input.charAt(i) == '0') {
                if(!isZero) {
                    countGoZero++;
                    isZero = true;
                }
            }else {
                if(isZero) {
                    countGoOne++;
                    isZero = false;
                }
            }
        }
        if(isZero) {
            countGoOne++;
        }else {
            countGoZero++;
        }
        
        if(countGoOne < countGoZero) {
            sb.append(countGoOne);
        }else {
            sb.append(countGoZero);
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


