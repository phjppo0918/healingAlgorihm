//직사각형에서 탈출
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        //xy 는 한수의 위치
       final int X = Integer.parseInt(st.nextToken());
       final int Y = Integer.parseInt(st.nextToken());
        
        //직사각형의 우상단 꼭지점
       final int W = Integer.parseInt(st.nextToken());
       final int H = Integer.parseInt(st.nextToken());

        int go [] = {
            X, //왼쪽으로
            W - X, //오른쪽
            H - Y, // 위
            Y, //아래     
        };
        int min = 1001;
        for(int i=0;i<4;i++) {
            if(go[i]< min) {
                min = go[i];
            }
        }
        
        bw.write(min+"\n");
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}