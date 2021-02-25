//직사각형에서 탈출
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int NUMBER_OF_INPUT =  Integer.parseInt(br.readLine());
        ArrayList<Long> number = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_INPUT;i++) {
            number.add(Long.parseLong(st.nextToken()));
        }
        
        final int REQUEST_OF_NUMBER = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<REQUEST_OF_NUMBER;i++) {
           long temp = Long.parseLong(st.nextToken());
            if(number.contains(temp)) {
                bw.write("1\n");
            }else {
                bw.write("0\n");
            }
        }
        
		br.close();
        
        
        
        bw.flush();
        bw.close();
    }   
    
}
