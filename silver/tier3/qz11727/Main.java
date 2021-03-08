import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
 
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        int dyArray[] = new int [1000];
        dyArray[0] = 1;
        dyArray[1] = 3;
        dyArray[2] = 5;
        for(int i=3;i<1000;i++) {
            dyArray[i] = (dyArray[i-1] + dyArray[i-2]*2 )%10007;
        }
        bw.write(dyArray[Integer.parseInt(br.readLine())-1] + "\n");
        bw.flush();
        br.close();
        bw.close();


    }
   
}
