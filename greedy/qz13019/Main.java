import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        int aLength = A.length();
        int bLength = B.length();
        boolean isSame = true;
        if(aLength != bLength) {
            isSame = false;
        }else {
            int aCount[] = new int [26];
            int bCount[] = new int [26];
            for(int i=0;i<aLength;i++) {
                aCount[A.charAt(i) - 'A']++;
                bCount[B.charAt(i) - 'A']++;
            }
            
            for(int i=0;i<26;i++) {
                if(aCount[i] != bCount[i]) {
                    isSame = false;
                    break;
                }
            }
        }
        int notMove = 0;
        if(isSame) {
            int pivot = bLength -1;
            for(int i=aLength-1;i>-1;i--) {
                if(B.charAt(pivot) == A.charAt(i)) {
                    notMove++;
                    pivot--;
                }
            }
            sb.append(aLength-notMove);
            
            
        }else {
            sb.append(-1);
        }
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


