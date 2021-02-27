import java.util.*;
import java.io.*;

public class Main2{

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int NUMBER_OF_TEST_CASE = Integer.parseInt(br.readLine());
        int answer[] = new int [NUMBER_OF_TEST_CASE];
        StringTokenizer st;//st.nextToken()
        int document[];
        int importanceCount[];
        
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++) {
            st = new StringTokenizer(br.readLine());
            int numberOfDocument = Integer.parseInt(st.nextToken());
            int requestDocument = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            document = new int[numberOfDocument];
            importanceCount = new int[9];
            for(int j=0;j<numberOfDocument;j++) {
                document[j] = Integer.parseInt(st.nextToken());
                importanceCount[document[j]-1]++;
            }
            
            int pivot = 0;
            int answerCount = 0;
            boolean isAnswer = false;
            for(int j=8;j>-1;j--) {
                
                while(importanceCount[j] !=0) {
                    
                    if(document[pivot]==j+1) {
                        answerCount++;
                        
                        if(pivot==requestDocument) {
                           answer[i] = answerCount; 
                            isAnswer = true;
                            break;
                        }
                        
                        document[pivot]=0;
                        importanceCount[j]--;
                    }else {
                        pivot++;
                        if(pivot==numberOfDocument){
                            pivot = 0;
                        }
                    }
                    
                }
                if(isAnswer) {
                    break;
                }
                
                
            }
            
        }
        
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++) {
            bw.write(answer[i]+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
        
        
    
    }
}
    