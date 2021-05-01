import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_INPUT = Integer.parseInt(br.readLine());
        Set<String> company = new HashSet<String>();
        for(int i=0;i<NUMBER_OF_INPUT;i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String activity = st.nextToken();
            if(activity.charAt(0)=='e') {
                company.add(name);
            }else {
                company.remove(name);
            }
        }
        List<String> companyList = new ArrayList<String>(company);
        companyList.sort(Comparator.reverseOrder());
        for(String k : companyList) {
            sb.append(k);
            sb.append("\n"); 
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


