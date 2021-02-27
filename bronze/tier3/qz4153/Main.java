import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        ArrayList<String> answer = new ArrayList<String>();
        int tri[];
        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            tri = new int [3];
            tri[0] = a;
            tri[1] = b;
            tri[2] = c;
            Arrays.sort(tri);
            if(a==0&&b==0&&c==0) {
                break;   
            }
            
            if(tri[0]*tri[0]+tri[1]*tri[1] == tri[2]*tri[2]) {
               answer.add("right");
            }else{
               answer.add("wrong");
            }
        }
        
        for(String k : answer) {
            bw.write(k+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}