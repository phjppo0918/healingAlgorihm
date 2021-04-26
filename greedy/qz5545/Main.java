import java.util.*;
import java.io.*;
//import java.math.BigInteger;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        final int NUMBER_OF_TOPPING = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pizzaPrice = Integer.parseInt(st.nextToken());
        int toppingPrice = Integer.parseInt(st.nextToken());
        int pizzaKcal = Integer.parseInt(br.readLine());
        int toppingKcal[] = new int [NUMBER_OF_TOPPING];
        for(int i=0;i<NUMBER_OF_TOPPING;i++) {
            toppingKcal[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(toppingKcal);
        double bestPizza = (double)pizzaKcal/pizzaPrice;
        for(int i=NUMBER_OF_TOPPING-1;i>=0;i--) {
            if(bestPizza <= (double)toppingKcal[i]/toppingPrice) {
                pizzaKcal += toppingKcal[i];
                pizzaPrice += toppingPrice;
                bestPizza = (double)pizzaKcal/pizzaPrice;
            }else {
                break;
            }
        }
        sb.append((int)bestPizza);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}


