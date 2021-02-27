import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num[] = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        Arrays.sort(num);
        int ans1;
        while(true){
           ans1 = num[1]%num[0]; 
            if(ans1==0) {
                ans1 = num[0];
                break;
            }
            num[1] = num[0];
            num[0] = ans1;
        }
        
        
        
       
        //최대공약수는 유클리드 호제법
        bw.write(ans1+"\n");
        bw.write(/ans1+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}