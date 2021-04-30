import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        br.readLine();
        int quest = 0;
        boolean keepGoing = true;
        while(keepGoing) {
            String input = br.readLine();
            switch(input) {
                case "문제":
                    quest++;
                    break;
                case "고무오리":
                    if(quest>0) {
                        quest--;
                    }else {
                        quest += 2;
                    }
                    break;
                default :
                    keepGoing = false;
                    break;      
            }
        }
        if(quest>0) {
            sb.append("힝구");
        }else {
            sb.append("고무오리야 사랑해");
        }
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


