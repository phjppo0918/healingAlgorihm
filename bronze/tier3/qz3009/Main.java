import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int arr [][] = new int [3][2];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        arr[1][0] = Integer.parseInt(st.nextToken());
        arr[1][1] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        arr[2][0] = Integer.parseInt(st.nextToken());
        arr[2][1] = Integer.parseInt(st.nextToken());
        sb.append(getSolo(arr[0][0], arr[1][0], arr[2][0]));
        sb.append(" ");
        sb.append(getSolo(arr[0][1], arr[1][1], arr[2][1]));

        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    public static int getSolo(int a, int b, int c) {
        if(a == b) {
            return c;
        }else if(a == c) {
            return b;
        }else {
            return a;
        }
    }
    
}


