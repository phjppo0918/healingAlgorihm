import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int num[] = new int [N];
        int total = 0;
        int haveNum[] = new int [8001]; //최빈값이 여러개 있을 때에는 최빈값 중 두 번 째로 작은 값을 출력한다.
        int maxHaveNum = 0;
        int maxHaveNumValue = -4001;
        int firstMaxHaveNum = -4001;
        int secondMaxHaveNum = -4001;
        
        for(int i=0;i<N;i++) {
            num[i] = Integer.parseInt(br.readLine());
            total += num[i];
            haveNum[num[i]+4000]++;
            if(haveNum[num[i]+4000]>maxHaveNum) {
                maxHaveNum = haveNum[num[i]+4000];
            }
        }
        for(int i=0;i<8001;i++) {
            if(haveNum[i]==maxHaveNum) {
                if(firstMaxHaveNum==-4001) {
                    firstMaxHaveNum = i - 4000;
                }else {
                    secondMaxHaveNum = i - 4000;
                    break;
                }
            }
        }
        if(secondMaxHaveNum==-4001) {
            maxHaveNumValue = firstMaxHaveNum;
        }else {
            maxHaveNumValue = secondMaxHaveNum;
        }
        Arrays.sort(num);
        double avg = (double)total/N; 
       
        
        bw.write(Math.round(avg)+"\n");
        bw.write(num[N/2]+"\n");
        bw.write(maxHaveNumValue+"\n");
        bw.write((num[N-1]-num[0])+"\n");

    
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}