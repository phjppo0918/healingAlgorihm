import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int X = Integer.parseInt(br.readLine());
        int lmLime[] = new int[10000];
        int count = 0;
        boolean isUp = false;
        int layer = 0;
        int x, y, gap;
        while( count < X ) {
            layer++;
            count += layer; 
            isUp = !isUp;
        }
        
        gap = count - X; 
        if(isUp) {
            x = layer - gap;
            y = 1 + gap;
        }else {
            y = layer - gap;
            x = 1 + gap;
        }
        
        
        sb.append(y + "/"+ x + "\n");
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
    
}





