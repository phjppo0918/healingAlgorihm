import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int start = Integer.parseInt(br.readLine());
        final int finish = Integer.parseInt(br.readLine());
        int num[] = new int [finish+1];
        for(int i=0;i<finish+1;i++) {
            num[i] = i;
        }
        num[1] = 0;
        int sosu[] = new int [5000];
        int pivot = -1;
        int startPoint = 0;
        int answer = 0;
        for(int i=2;i<finish+1;i++) {
            if(num[i] != 0) {
                pivot++;
                sosu[pivot] = i;
                if(i >= start) {
                    answer += i;
                }
                for(int j=1; i*j<finish+1;j++) {
                    num[i*j] = 0;
                }
            }
        }
        
        for(int i=0;i<pivot+1;i++) {
            if(sosu[i]>start-1) {
                startPoint = sosu[i];
                break;
            }
        }
        sb.append(answer);
        sb.append("\n");
        sb.append(startPoint);
        sb.append("\n");        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}





