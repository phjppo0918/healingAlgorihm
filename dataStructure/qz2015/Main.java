import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CASE = Integer.parseInt(st.nextToken());
        final int ADD_NUM = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        long answer = 0;
        int caseArr[] = new int[NUMBER_OF_CASE + 1];
        st = new StringTokenizer(br.readLine());
        int addTemp = 0;
        for(int i=1;i<=NUMBER_OF_CASE;i++) {
            addTemp += Integer.parseInt(st.nextToken());
           // caseArr[i] = addTemp;
            
            answer += hashMap.getOrDefault(addTemp - ADD_NUM, 0);
            
            hashMap.put(addTemp, hashMap.getOrDefault(addTemp, 0) + 1);
        }
        
    
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


