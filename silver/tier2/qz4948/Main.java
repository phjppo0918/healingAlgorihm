import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int MAX = 123456;
        int arr[] = new int[MAX*2+1];
        for(int i=2; i<MAX*2+1; i++) {
            arr[i] = i;
        }
        

        for(int i=2; i<MAX*2+1; i++) {
            if(arr[i] != 0) {
               
                int temp = i;
                for(int j=2;temp*j<MAX*2+1;j++) {
                    arr[temp*j] = 0;
                }
            }
        }
        
        int count = 0;
        while(true) {
            
            int num = Integer.parseInt(br.readLine());
            
            if(num == 0) break;
            if(num == 1) {
                sb.append(1);
                sb.append("\n"); 
                continue;
            };
            for(int i=num+1;i<=num*2;i++) {
                if(arr[i] != 0) {
                    count++;
                }
            }
            
            sb.append(count);
            sb.append("\n");
            
            count = 0;       
        } 
        
   //     sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


