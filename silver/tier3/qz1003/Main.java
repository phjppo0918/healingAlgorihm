import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        //StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_CASE = Integer.parseInt(br.readLine());
        int pivonacci[] = new int [41];
        pivonacci[0] = 1;
        pivonacci[1] = 1;
        for(int i=2;i<41;i++) {
            pivonacci[i] = pivonacci[i-1] + pivonacci[i-2];
        }
        int answer[][] = new int[NUMBER_OF_CASE][2];
        for(int i=0;i<NUMBER_OF_CASE;i++) {
            int request = Integer.parseInt(br.readLine());
            if(request>1) {
                 answer[i][0] = pivonacci[request-2];
                answer[i][1] = pivonacci[request-1];
            }else if(request==1) {
                answer[i][0] = 0;
                answer[i][1] = 1;
            }else { //0일 때
                answer[i][0] = 1;
                answer[i][1] = 0;
            }
          
        }
         for(int i=0;i<NUMBER_OF_CASE;i++) {
             bw.write(answer[i][0]+ " " + answer[i][1]+"\n");
         }
        bw.flush();
		br.close();
		bw.close();
        
        
    }

 
}