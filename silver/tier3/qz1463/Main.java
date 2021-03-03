import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int dynamic[] = new int[N+1];
        dynamic[0] = 0;
        dynamic[1] = 0;

        for(int i=2;i<N+1;i++) {
           dynamic[i] = dynamic[i-1] + 1;
           if (i % 2 == 0) {
               dynamic[i] = Math.min(dynamic[i], dynamic[i/2] + 1);
           } 
           if (i % 3 == 0) {
               dynamic[i] = Math.min(dynamic[i], dynamic[i/3] + 1);
           }
        }
        bw.write(dynamic[N]+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }

 
}