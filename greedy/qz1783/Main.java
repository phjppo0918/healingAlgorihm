import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    static int x = 1;
    static int y = 1;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int HEIGHT = Integer.parseInt(st.nextToken());
        final int WIDTH = Integer.parseInt(st.nextToken());
        int answer = 1;
        do{
            //초기 4수 행마
            if(HEIGHT <= 1) break;
            
            if(HEIGHT <= 2) {
                if(WIDTH <= 2) {                  
                    break;
                }
                
                while(x + 2 <= WIDTH) {
                    x+=2;
                    answer++;
                    if(answer == 4) {
                        break;
                    }
                }
                
            }else {
                switch(WIDTH){
                    case 1:
                    case 2:                      
                    case 3:                       
                    case 4:
                        answer = WIDTH;
                        break;
                    case 5:
                        answer = 4;
                        break;
                    default: 
                        answer = WIDTH -2;
                        break;
                }
            } 
        }while(false);
       
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    public static void two_top_one_right() {
        x += 2;
        y += 1;
    }
    public static void one_top_two_right() {
        x += 1;
        y += 2;
    }
    public static void one_bottom_two_right() {
        x -= 1;
        y += 2;
    }
    public static void two_bottom_one_right() {
        x -= 2;
        y += 1;
    }
    
}


