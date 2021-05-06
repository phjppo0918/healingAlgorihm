import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        HashSet<Integer> hashSet; // = new HashSet<Integer>();
        char [] input = br.readLine().toCharArray();
        while(input[0] != '*') {
            int stair = 1;
            boolean isSurpr = true;
            
            
            while(stair < input.length) {
                hashSet = new HashSet<Integer>();
                
                for(int i=0;i<input.length-stair;i++) {
                    int temp = input[i]*100 +  input[i+stair];
                    if(hashSet.contains(temp)) {
                        isSurpr = false;
                        break;
                    }else {
                        hashSet.add(temp);
                    }
                }
                
                if(!isSurpr) {
                    break;
                }
                
                stair++;
            }
            
            for(char k : input) {
                sb.append(k);
            }
            if(isSurpr) {    
                sb.append(" is surprising.\n");
            }else {
                sb.append(" is NOT surprising.\n");
            }
            
            
            
            input = br.readLine().toCharArray();
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


