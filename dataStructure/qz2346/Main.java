import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        final short NUMBER_OF_BALLOON = (short)Integer.parseInt(br.readLine());
        int balloon[] = new int [NUMBER_OF_BALLOON];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for(short i=0;i<NUMBER_OF_BALLOON;i++) {
           balloon[i] = Integer.parseInt(st.nextToken());
                          
        }
        short pivot = 0;
        short boomCount = 0;
        while(true) {
            int boom =  balloon[pivot];
            sb.append(pivot+1);
            sb.append(" ");
            balloon[pivot] = 0;
            boomCount++;
            
            if(boomCount==NUMBER_OF_BALLOON) {
                break;
            }
            
            if(boom > 0) {
                for(short i=0;i<boom;) {
                    pivot++;
                    if(pivot == NUMBER_OF_BALLOON) {
                        pivot = 0;
                    }
                    
                    if(balloon[pivot]==0) {            
                        continue;
                    }
                    i++;                  
                }
            }else {
                for(short i=0;i<(boom * -1);) {
                    pivot--;
                    if(pivot == -1) {
                        pivot = (short)(NUMBER_OF_BALLOON-1);
                    }
                    
                    if(balloon[pivot]==0) {
                        continue;
                    }
                    i++;  
                    
                }
            }
        }
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
       // br.close();
        bw.close();
        
    }

    
}


