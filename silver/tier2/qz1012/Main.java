import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static boolean farm[][];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        //= new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        int answer[] = new int[NUMBER_OF_TESTCASE];
        
        
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());//ㅡ
            int column = Integer.parseInt(st.nextToken()); // ㅣ
            farm = new boolean[column+2][row+2]; //상하좌우 커버 하나씩(오버 방지
            int numberOfBechu = Integer.parseInt(st.nextToken());
            for(int j=0;j<numberOfBechu;j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) + 1; //가로
                int y = Integer.parseInt(st.nextToken()) + 1; // 세로 +1은 커버
                farm[y][x] = true;
            }
            
            for(int j=1;j<column+1;j++) {
                for(int k=1;k<row+1;k++) {
                    if(farm[j][k]) {
                        answer[i]++;
                        putWorm(j,k);
                    }
                }
            }
            
        }
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            bw.write(answer[i]+"\n");
        }
        
        bw.flush();
        br.close();
        bw.close();


    }
    public static void putWorm(int y, int x) {
        if(!farm[y][x]) {
            return;
        }
        farm[y][x] = false;
        //상
        putWorm(y-1,x);
        //하
        putWorm(y+1,x);
        //좌
        putWorm(y,x-1);
        //우
        putWorm(y,x+1);
    }
}

