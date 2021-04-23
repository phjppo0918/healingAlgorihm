import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for(int i=0;i<NUMBER_OF_TESTCASE;i++) {
            
            st = new StringTokenizer(br.readLine());
            int kindOfMoneyCase = Integer.parseInt(st.nextToken());
            int kindOfStiker = Integer.parseInt(st.nextToken());

            Money money[] = new Money[kindOfMoneyCase];						
						for(int j=0;j<kindOfMoneyCase;j++) {
							st = new StringTokenizer(br.readLine());
							int numberOfCoin = Integer.parseInt(st.nextToken());
							money[j] = new Money(kindOfStiker);

							for(int k=0;k<numberOfCoin;k++) {
								int c = Integer.parseInt(st.nextToken());
								money[j].coin[c-1] = true;
							}

							money[j].price = Integer.parseInt(st.nextToken());
						}

            int numberOfStiker[] = new int [kindOfStiker];
						st = new StringTokenizer(br.readLine());
						for(int j=0;j<kindOfStiker;j++) {
							int c = Integer.parseInt(st.nextToken());
							numberOfStiker[j] = c;
						}

						int answer = 0;
						for(int j=0;j<kindOfMoneyCase;j++) {
							int minNum = 10000;
							for(int k=0;k<money[j].coin.length;k++) {
								if(money[j].coin[k]) {
									if(numberOfStiker[k] < minNum) {
										minNum = numberOfStiker[k];
									}
								}
							}

							answer += minNum * money[j].price;

						}

            sb.append(answer);
            sb.append("\n"); 
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}
class Money {
    boolean coin[];
    int price;
    public Money(){};
    public Money(int numberOfneedCount) {
      coin = new boolean [numberOfneedCount];
    }
}

