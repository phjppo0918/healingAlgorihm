import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       // StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(br.readLine());
        int count = 0;
        
        while (number >= 5) {
            count += number / 5;
            number /= 5;
        }

        bw.write(count+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }

 
}