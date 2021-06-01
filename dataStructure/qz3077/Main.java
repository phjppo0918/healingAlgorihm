import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<String, Integer> inputMap = new HashMap<String, Integer>();
        for(int i=1;i<=NUMBER_OF_CASE;i++) {
            inputMap.put(st.nextToken(),i);
        }
        st = new StringTokenizer(br.readLine());
        int inputLocation[] = new int[NUMBER_OF_CASE];
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            inputLocation[i] = inputMap.get(st.nextToken());
        }
        final int MAX_SCORE = NUMBER_OF_CASE * (NUMBER_OF_CASE-1) / 2;
        int score = 0;
        for(int i=0;i<NUMBER_OF_CASE-1;i++) {
            for(int j=i+1;j<NUMBER_OF_CASE;j++) {
                if(inputLocation[i] < inputLocation[j]) {
                    score++;
                }
            }
        }
        sb.append(score);
        sb.append("/"); 
        sb.append(MAX_SCORE);
        sb.append("\n");
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


