import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int R = Integer.parseInt(br.readLine());
        int texi = R*2;
        System.out.printf("%.6f\n",R*R*3.141592653589793238);
        System.out.printf("%.6f\n",(double)R*texi);

        //sb.append("\n"); 
        
       // bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


