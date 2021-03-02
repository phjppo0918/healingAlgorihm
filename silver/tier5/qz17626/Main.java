import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        final int LIMIT = 224;
        int numDouble[] = new int [LIMIT]; //계산 편하게 1+; 최대 223
        for (int i=1;i<LIMIT;i++) {
            numDouble[i] = i*i;
        }
        int answer = 1;
        boolean haveAnswer = false;
        while(answer!=4) {
            switch(answer) {
                    
                case 1:
                    for(int i=1;i<LIMIT;i++) {
                        if(numDouble[i]==N) {
                            haveAnswer = true;
                            break;
                        }
                    }
                    break;
                    
                case 2:
                    for(int i=1;i<LIMIT-1;i++) {
                        
                        for(int j=i+1;j<LIMIT;j++) {
                            
                            if((numDouble[i]+numDouble[j])==N) {
                                 
                                haveAnswer = true;
                                break;
                                 
                            }
                        } 
                       
                    }
                    break;    
                  case 3:
                    for(int i=1;i<LIMIT-2;i++) {
                        
                        for(int j=i+1;j<LIMIT-1;j++) {
                            
                            for(int k=j+1;k<LIMIT;k++) {
                                
                                if((numDouble[i]+numDouble[j]+numDouble[k])==N) {
                                 
                                    haveAnswer = true;
                                    break;
                                 
                                }
                                
                            }
                            
                        } 
                       
                    }
                    break;       
                
            }
            if(haveAnswer) {
                break;
            }
            answer++;
        }
        
        bw.write(answer+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}
