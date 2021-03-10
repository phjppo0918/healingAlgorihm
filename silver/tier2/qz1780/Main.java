import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int count[] = new int[3];
    public static int paper[][];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
            //= new StringTokenizer(br.readLine());
        
        final int PAPER_LENGTH = Integer.parseInt(br.readLine());
        
        paper = new int [PAPER_LENGTH][PAPER_LENGTH]; //여백 생각?
        for(int i=0;i<PAPER_LENGTH;i++) {
            st = new StringTokenizer(br.readLine()); 
            for(int j=0; j<PAPER_LENGTH;j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dividePaper(0,0,PAPER_LENGTH);
        for(int i : count) {
            bw.write(i+"\n");
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    } 
    
    public static void dividePaper(int y, int x, int size) {
        int basePaper = paper[y][x];
        boolean canCut = true;
        if(size==1) {
            count[basePaper+1]++;
            return;
        }
        
        for(int i=y;i<y+size;i++) {
            for(int j=x;j<x+size;j++) {
                if(basePaper != paper[i][j]) {
                    canCut = false;
                    break;
                }
            }
            if(!canCut) {
                break;
            }
        }
        
        if(canCut) {
            count[basePaper+1]++;
            return;
        }else {
            int nextSize = size/3;
            //1사
            dividePaper(y,x,nextSize);
            //2사
            dividePaper(y,x+nextSize,nextSize);
            //3사
            dividePaper(y,x+nextSize*2,nextSize);
            //4사
            dividePaper(y+nextSize,x,nextSize);
            //5사
            dividePaper(y+nextSize,x+nextSize,nextSize);
            //6사
            dividePaper(y+nextSize,x+nextSize*2,nextSize);
            //7사
            dividePaper(y+nextSize*2,x,nextSize); 
            //8사
            dividePaper(y+nextSize*2,x+nextSize,nextSize);
            //9사
            dividePaper(y+nextSize*2,x+nextSize*2,nextSize);
        }
        
        
        
        
        
    }

}

