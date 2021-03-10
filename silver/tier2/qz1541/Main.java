import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //StringTokenizer st = new StringTokenizer(br.readLine());
        String input = br.readLine();
        int operand[] = new int[50];
        int pivot = 0;
        String tempStr = new String();
        int tempInt;
        boolean endOperPlus = true;
        for(int i=0;i<input.length();i++) {
            if(input.charAt(i)=='+') {
                tempInt = Integer.parseInt(tempStr);
                operand[pivot] += tempInt;
                tempStr = new String();
                endOperPlus = true;
            }else if(input.charAt(i)=='-') {
                tempInt = Integer.parseInt(tempStr);
                operand[pivot] += tempInt;
                tempStr = new String();
                pivot++;
                endOperPlus = false;
            }else {
                //System.out.println(input.charAt(i));
                tempStr = tempStr + input.charAt(i);
            }
        }
        if(!endOperPlus) {
            pivot++;  
        }
        operand[pivot] += Integer.parseInt(tempStr);
        int answer = operand[0];
        for(int i=1;i<pivot+1;i++) {
            answer -= operand[i];
        }
        bw.write(answer+"\n");
        
        bw.flush();
        br.close();
        bw.close();
    } 
    

}

