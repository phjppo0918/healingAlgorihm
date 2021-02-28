import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int num[] = new int [10001];
        int temp;
        for(int i=0;i<N;i++) {
            temp = Integer.parseInt(br.readLine());
            num[temp-1]++;
        }
        
        for(int i=0;i<10001;i++) {
            while(num[i]>0) {
                bw.write(i+1+"\n");
                num[i]--;
            }
        }
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}