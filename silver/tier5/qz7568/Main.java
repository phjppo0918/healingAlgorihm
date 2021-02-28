import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int element[][] = new int [N][2];
        int answer[] = new int [N];
         StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
             st = new StringTokenizer(br.readLine());
            element[i][0] = Integer.parseInt(st.nextToken());
            element[i][1] = Integer.parseInt(st.nextToken());
        }
        
       for(int i=0;i<N;i++) {
            for(int j=N-1;j>i;j--) {
                if(element[i][0]>element[j][0] &&element[i][1]>element[j][1]) {
                    answer[j]++;
                }
                
                if(element[i][0]<element[j][0] &&element[i][1]<element[j][1]) {
                    answer[i]++;
                }
            }
       }
       for(int i=0;i<N;i++) {
           answer[i]++;
           bw.write(answer[i]+" ");
       }
           bw.write("\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}