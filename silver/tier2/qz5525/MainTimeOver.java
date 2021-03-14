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
        int cycleLength = cycle*2+1;
        int totalLength = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 0;
        boolean isIO = true;
        
        for(int i=0;i<totalLength-cycleLength+1;i++) {
            if(str.charAt(i)=='I') {
                for(int j=i+1;j<i+cycleLength-1;j+=2){
                    if(str.charAt(j)!='O'||str.charAt(j+1)!='I') {
                        isIO=false;
                        break;
                    }
                }
                
                if(str.charAt(i+cycleLength-1)!='I') {
                    isIO = false;
                }
                if(isIO) {
                    count++;
                }else {
                    isIO = true;
                }
            }
        }
        bw.write(count+"\n");
        
        
        
        
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
   
}
