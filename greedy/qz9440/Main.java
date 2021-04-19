import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        int number[];
        ArrayList <Integer> answer = new ArrayList<Integer>();
        
        while(true) {
            String input = br.readLine();
            number = new int [10];
            
            if(input.equals("0")) {
                break;
            }
            
            String inpArr[] = input.split(" ");
            for(int i=1;i<inpArr.length;i++) {
                number[Integer.parseInt(inpArr[i])]++;
            }
            
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();
           
            int turnCount = 0;
            for(int i=1;i<10;i++) {
                while(number[i] != 0) {
                    turnCount++;
                    number[i]--;
                    
                    if(turnCount%2==1) {
                        num1.append(i); 
                    }else {
                        num2.append(i); 
                    }
                    
                    if(turnCount == 2) {
                        break;
                    }
                }
                
                if(turnCount == 2) {
                    break;
                }
            }
            
            while(number[0] != 0) {
                turnCount++;
                number[0]--;
               if(turnCount%2==1) {
                    num1.append(0);
               }else {
                    num2.append(0);
               }
            }
            
            for(int i=1;i<10;i++) {
                while(number[i] != 0) {
                    turnCount++;
                    number[i]--;
                    
                    if(turnCount%2==1) {
                        num1.append(i); 
                    }else {
                        num2.append(i); 
                    }
                    
                }
                
            }
            
            
            
            
            sb.append(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));
            sb.append("\n");        
            
        }

        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


