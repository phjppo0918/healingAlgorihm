import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int SCREEN_WIDTH = Integer.parseInt(st.nextToken());
        final int BASKET_WIDTH = Integer.parseInt(st.nextToken());
        
        final int NUMBER_OF_APPLE = Integer.parseInt(br.readLine());
        int fallingAppleLocation[] = new int [NUMBER_OF_APPLE];     
        for(int i=0;i<NUMBER_OF_APPLE;i++) {
            fallingAppleLocation[i] = Integer.parseInt(br.readLine());
        }
        
        int basketLeftPoint = 1;
        int basketRightPoint = BASKET_WIDTH;
        
        int answer = 0;
        int fallingApple;
        for(int i=0;i<NUMBER_OF_APPLE;i++) {
            fallingApple = fallingAppleLocation[i];
            
            if(basketLeftPoint<=fallingApple && fallingApple<=basketRightPoint) {
                continue;
            }
            
            if(fallingApple <= basketLeftPoint) {
                int gap = basketLeftPoint - fallingApple;
                answer += gap;
                basketLeftPoint = fallingApple;
                basketRightPoint = basketLeftPoint + BASKET_WIDTH - 1;
            }else {
                int gap = fallingApple - basketRightPoint;
                answer += gap;
                basketRightPoint = fallingApple;
                basketLeftPoint = basketRightPoint - BASKET_WIDTH + 1;
  
            }
            
        }
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


