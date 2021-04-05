import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
       // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int MAX = 10000;
        int arr [] = new int [MAX+1];
        int sosu [] = new int [1229];
        int pivot = -1;
        for(int i=2;i<=MAX;i++) {
            arr[i] = i;
        }
        for(int i=2;i<=MAX;i++) {
            if(arr[i] != 0) {
                pivot++;
                sosu[pivot] = i;
                
                
                for(int j=2;i*j<=MAX;j++) {
                    arr[i*j] = 0;
                }
            }
        }
        
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            int testCase = Integer.parseInt(br.readLine());
            int num1, num2;
            int ans1=0, ans2=0, ansGap= 10000;
            
            for(int j=0;j<1229;j++) {
                
                if(testCase < sosu[j]) {
                    break;
                }
                
                if(arr[testCase-sosu[j]] != 0) {
                    num2 = sosu[j];
                    num1 = testCase - num2;
                    if(getGap(num1,num2) < ansGap) {
                        ans1 = num1;
                        ans2 = num2;
                        ansGap = getGap(num1,num2);
                    }else {
                        break;
                    }
                }
                
            }
            
            if(ans1 <= ans2) {
                sb.append(ans1);
                sb.append(" ");
                sb.append(ans2);
            }else {
                sb.append(ans2);
                sb.append(" ");
                sb.append(ans1);
            }
            sb.append("\n");
        }
               
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    public static int getGap(int num1, int num2) {
        if(num1 >= num2) {
            return num1 - num2;
        }else{
            return num2 - num1;
        }
    }
    
}


