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
        int numberOfNote1Case, numberOfNote2Case;
        Set<Integer> note1; 
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            note1 = new HashSet<Integer>();
            numberOfNote1Case = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<numberOfNote1Case;j++) {
                note1.add(Integer.parseInt(st.nextToken()));
            }
            
            numberOfNote2Case = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<numberOfNote2Case;j++) {
                int note2 = Integer.parseInt(st.nextToken());
                if(note1.contains(note2)) {
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }
            }
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


