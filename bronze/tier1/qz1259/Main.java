//직사각형에서 탈출
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        ArrayList<String> answer = new ArrayList<>();
        String input;
        
        while(true) {
            input = br.readLine();
            if(input.equals("0")) {
                break;
            }
            
            switch (input.length()) {
                case 1 : 
                    answer.add("yes");
                    break;
                case 2 : 
                    if(input.charAt(0) == input.charAt(1)) {
                         answer.add("yes");
                    }else{
                         answer.add("no");
                    }
                    break;
                case 3 : 
                    if(input.charAt(0) == input.charAt(2)) {
                         answer.add("yes");
                    }else{
                         answer.add("no");
                    }
                    break;
                case 4 : 
                    if((input.charAt(0) == input.charAt(3))&&
                               (input.charAt(1) == input.charAt(2))) {                       
                         answer.add("yes");
                    }else{
                         answer.add("no");
                    }
                    break;
                case 5 :
                     if((input.charAt(0) == input.charAt(4))&&
                               (input.charAt(1) == input.charAt(3))) {                       
                         answer.add("yes");
                    }else{
                         answer.add("no");
                    }   
                    break;
            }
            
        }
        
        Iterator it = answer.iterator();
        
        while(it.hasNext()) {
              bw.write(it.next()+"\n");
        }
      
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}