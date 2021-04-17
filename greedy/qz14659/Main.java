import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_HANJO = Integer.parseInt(br.readLine());
        int hanjo[] = new int [NUMBER_OF_HANJO];
        
        st = new StringTokenizer(br.readLine());
        for(int i =0; i< NUMBER_OF_HANJO;i++) {
            hanjo[i] = Integer.parseInt(st.nextToken());
        }
        int bestKill = 0;
        int tempUser = hanjo[0];
        int killTemp = 0;
        for(int i=1;i<NUMBER_OF_HANJO;i++) {
            if(tempUser > hanjo[i]) {
                killTemp++;
            }else {
                tempUser = hanjo[i];
                if(killTemp > bestKill) {
                    bestKill = killTemp;
                }
                killTemp = 0;
            }
        }
        
        if(killTemp > bestKill) {
            bestKill = killTemp;
        }
        
        sb.append(bestKill);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


