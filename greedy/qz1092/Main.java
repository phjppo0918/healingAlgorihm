import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CRAIN = Integer.parseInt(br.readLine());
        st =  new StringTokenizer(br.readLine());
        int crainWeight[] = new int [NUMBER_OF_CRAIN];
        int operLine[] = new int [NUMBER_OF_CRAIN];
        int operLineWorkLoad[] = new int [NUMBER_OF_CRAIN];
        int maxCrainWeight = 0;
        for(int i=0;i<NUMBER_OF_CRAIN;i++) {
            crainWeight[i] = Integer.parseInt(st.nextToken());
            operLine[i]++;
            if(maxCrainWeight < crainWeight[i]) {
                maxCrainWeight = crainWeight[i];
            }
        }
        Arrays.sort(crainWeight); 
        
        int NUMBER_OF_BOX = Integer.parseInt(br.readLine());
        st =  new StringTokenizer(br.readLine());
        int box;
        int maxBoxWeight = 0;
        for(int i=0;i<NUMBER_OF_BOX;i++) {
            box = Integer.parseInt(st.nextToken());
            
            if(maxBoxWeight < box) {
                maxBoxWeight = box;
            }
            
            for(int j=0;j<NUMBER_OF_CRAIN;J++) {
                if(box <= crainWeight[j]) {
                    operLineWorkLoad[j]++;
                    break;
                }
            }           
        }
        
        
        
        if(maxBoxWeight <= maxCrainWeight) {
            while(NUMBER_OF_BOX < 1) {
                int operTime = 0;
                for(int i=NUMBER_OF_CRAIN-1;i>-1;i--) {
                    
                    if(operLineWorkLoad[i] == 0) {
                        
                    }
                    
                    if(operLineWorkLoad[i] > 0) {
                        operLineWorkLoad[i] -= operLine[i];
                        operTime +=  operLine[i];
                    }
                    
                    
                }
            }
            
            
        }else {
            sb.append(-1)
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


