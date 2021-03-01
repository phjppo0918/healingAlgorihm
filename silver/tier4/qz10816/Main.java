//10816
import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> haveCard = new HashMap<Integer, Integer>();
        final int NUMBER_OF_ELEMENT = Integer.parseInt(br.readLine());
        int temp[] = new int[NUMBER_OF_ELEMENT];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<NUMBER_OF_ELEMENT;i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(temp);
        int keyTemp = temp[0];
        int valueTemp = 1;
        
        for(int i=1;i<NUMBER_OF_ELEMENT;i++) {
            if(temp[i]==temp[i-1]) {
                valueTemp++;
            }else {
                haveCard.put(keyTemp,valueTemp);
                keyTemp = temp[i];
                valueTemp = 1;
            }
        }
        
        haveCard.put(keyTemp,valueTemp);
        
        final int NUMBER_OF_REQUEST = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int searchKey;
        for(int i=0;i<NUMBER_OF_REQUEST;i++) {
            searchKey = Integer.parseInt(st.nextToken());
            if(haveCard.containsKey(searchKey)) {
                bw.write(haveCard.get(searchKey)+" ");
            }else {
                bw.write("0 ");
            }
        }
        bw.write("\n");
       
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}