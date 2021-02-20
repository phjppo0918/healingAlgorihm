//달달함이 넘쳐흘러
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        final int AX = Integer.parseInt(st.nextToken());
        final int AY = Integer.parseInt(st.nextToken());
        final int AZ = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        final int CX = Integer.parseInt(st.nextToken());
        final int CY = Integer.parseInt(st.nextToken());
        final int CZ = Integer.parseInt(st.nextToken());
        
        final int BX = CX-AZ;
        final int BY = CY/AY;
        final int BZ = CZ-AX;
        
      
        bw.write(BX + " " + BY + " " + BZ + "\n");
        
        bw.flush();
		br.close();
		bw.close();
    }
}