import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static int recode[];
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int NUMBER_OF_INPUT =  Integer.parseInt(br.readLine());
        recode = new int [NUMBER_OF_INPUT];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_INPUT;i++) {
            recode[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(recode);
        
        final int NUMBER_OF_REQUEST =  Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int temp, start,middle,finish;
        boolean isHave[] = new boolean [NUMBER_OF_REQUEST];
        for(int i=0;i<NUMBER_OF_REQUEST;i++) {
            temp = Integer.parseInt(st.nextToken());
            start = 0;
            finish = NUMBER_OF_INPUT-1;
            while(start <= finish) {
                middle = (start+finish)/2;
                if(recode[finish]==temp){
                    isHave[i] = true;   
                }
                
                if(recode[middle]>temp) {
                    finish = middle-1;
                }else if(recode[middle]==temp){
                   isHave[i] = true;
                    break;
                }else{
                    start = middle+1;
                }
            }
            if(isHave[i]){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }
        
		br.close();
        
        
        
        bw.flush();
        bw.close();
    }

}
