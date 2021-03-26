import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//import java.math.BigInteger;
public class Main{
    public static int N;
    public static int r;
    public static int c;
    public static int count = -1;
    public static int answer = -1;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int transN = 1;
        for(int i=0;i<N;i++) {
            transN *= 2;
        }
        countVisit(0,0,transN);
              
        sb.append(answer + "\n");
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    } 
    public static void countVisit(int x, int y, int size) { //좌상단 기준
        if(answer != -1) {
            return;
        }
       
        
        if(size==1) {
            count++;
            if(y==r&&x==c) {
                answer = count;
            }
            return;
        }
        
        if(y+size/2-1<r) {
            count += (size * size)/2;
            
           if(x+size/2-1<c) {
                count += (size * size)/4;

                //4사분면
                countVisit(x+size/2,y+size/2,size/2);
                return;
           }else {
               //3사분면
                countVisit(x,y+size/2,size/2);
                return;
           }
            
        }else {
            
            if(x+size/2-1<c) {
                count += (size * size)/4;

                //2사분면
                countVisit(x+size/2,y,size/2);
                return;
           }else {
               //1사분면
                countVisit(x,y,size/2);
                return;
           }
            
        }
            
            
        
       
        
    }
}



