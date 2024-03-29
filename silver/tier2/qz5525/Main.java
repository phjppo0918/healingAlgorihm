import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st;
            //= new StringTokenizer(br.readLine());
        int cycle = Integer.parseInt(br.readLine());
        int totalLength = Integer.parseInt(br.readLine());
        char str[] = br.readLine().toCharArray();
        
        int ioCount = 0;
        int answer = 0;
        for(int i=1;i<totalLength-1;i++) {
            if(str[i-1]=='I'&&str[i]=='O'&&str[i+1]=='I') {
                
                ioCount++;
                
                if(ioCount==cycle) {
                    answer++;
                    ioCount--;
                }
                i++;
            }else {
                ioCount = 0;
            }
        }
        
        bw.write(answer+"\n");
        
        
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
   
}
