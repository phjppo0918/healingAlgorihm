import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken())-b;
        
        int answer = v/(a-b);
        if(v%(a-b) != 0) {
            answer++;
        }
        
        bw.write(answer+"\n");
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}