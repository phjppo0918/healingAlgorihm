// 단어 정렬
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        final int NUMBER_OF_VOCA = Integer.parseInt(br.readLine());
        String voca [] = new String [NUMBER_OF_VOCA];
        for(int i=0;i<NUMBER_OF_VOCA;i++) {
            voca[i] = br.readLine();
        }
        String sort [] = new String [NUMBER_OF_VOCA];
       //퀵 정렬 도입 + 중복 제거 + 단어순 정렬
       
        for(int i=0;i<NUMBER_OF_VOCA;i++) {
            bw.write(voca[i]+"\n");
        }
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}