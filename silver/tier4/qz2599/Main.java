import java.util.*;
import java.io.*;
//import java.math.BigInteger; 
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        int stu[][] = new int [3][2];
        int answer[][] = new int [3][2];
        final int NUMBER_OF_STUDENT = Integer.parseInt(br.readLine());
        boolean isAnswer = false;
        for(int i=0;i<3;i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            stu[i][0] = num1;
            stu[i][1] = num2;
        }
        
        for(int i=0;i<=stu[0][0];i++) {
            answer[0][0] = i; // A남 짝 B여
            answer[0][1] = stu[0][0] - answer[0][0]; // A남 짝 C여 = A남 - A남 짝 B여
            answer[1][1] = stu[2][1] - answer[0][1];
            answer[1][0] = stu[1][0] - answer[1][1];
            answer[2][0] = stu[0][1] - answer[1][0];
            answer[2][1] = stu[2][0] - answer[2][0];
            
            if(answer[0][0] >=0 && answer[1][0] >=0 && answer[2][0] >=0 &&
               answer[0][1] >=0 && answer[1][1] >=0 && answer[2][1] >=0 ) {
                isAnswer = true;
                break;
            }
        }
        
        if(isAnswer) {
            sb.append("1\n");
            sb.append(answer[0][0]);
            sb.append(" ");
            sb.append(answer[0][1]);
            sb.append("\n");

            sb.append(answer[1][0]);
            sb.append(" ");
            sb.append(answer[1][1]);
            sb.append("\n");
            
            sb.append(answer[2][0]);
            sb.append(" ");
            sb.append(answer[2][1]);
            sb.append("\n");

        }else {
            sb.append(0);
        }
        
        
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


