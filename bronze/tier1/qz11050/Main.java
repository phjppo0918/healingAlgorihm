import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        //n! / k!(n-k)!     
        
        int answer = 1;
        
        for(int i=k+1;i<n+1;i++) {
            answer*=i;
        }
        for(int i=1;i<n-k+1;i++) {
            answer/=i;
        }
       
        bw.write(answer+"\n");
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}