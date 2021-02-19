//다리 놓기
// 결국 조합문제...아닌가?

import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class Main {
    public static void main(String [] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        final int NUMBER_OF_TEST_CASE = Integer.parseInt(st.nextToken());
        int temp1, temp2;
        TestCase tc[] = new TestCase[NUMBER_OF_TEST_CASE];
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++){
            st = new StringTokenizer(br.readLine());
            temp1 = Integer.parseInt(st.nextToken());
            temp2 = Integer.parseInt(st.nextToken());
            tc[i] = new TestCase(temp1, temp2);
        }
        BigInteger answerTemp;
        for(int i=0;i<NUMBER_OF_TEST_CASE;i++) {
            answerTemp = tc[i].getNumberofBridge();
            bw.write(answerTemp + "\n");
        }
        
        bw.flush();
		br.close();
		bw.close();
    }
}

class TestCase {
    private int numberOfWestSite;
    private int numberOfEastSite;
    private BigInteger numberOfBridge; //큰 수 도입 해야 long으로도 해결 안됨
    
    public TestCase(int numberOfWestSite, int numberOfEastSite) {
        this.numberOfWestSite = numberOfWestSite;
        this.numberOfEastSite = numberOfEastSite;
        CountBridge();
    }
    
    private void CountBridge() {
        BigInteger count = new BigInteger("1");
        for(int i=numberOfEastSite; i>numberOfWestSite; i--){
            
           count = count.multiply(new BigInteger(i+""));
        }
        for(int i=numberOfEastSite-numberOfWestSite; i>1; i--){
            count = count.divide(new BigInteger(i+""));
        }
        this.numberOfBridge = count;
    }
    
    public BigInteger getNumberofBridge() {
        return this.numberOfBridge;
    } 
    
}