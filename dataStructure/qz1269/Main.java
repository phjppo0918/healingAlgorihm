import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_A = Integer.parseInt(st.nextToken());
        final int NUMBER_OF_B = Integer.parseInt(st.nextToken());
        
        HashSet<Integer> hs = new HashSet<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_A;i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_B;i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(hs.contains(temp)) {
                hs.remove(temp);
            }else {
                hs.add(temp);
            }
        }   
        
        sb.append(hs.size());
        

        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


