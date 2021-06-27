import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_BUILDING = Integer.parseInt(br.readLine());
        Stack<Integer> building = new Stack<>();

        long answer = 0;

        for (int i = 0; i < NUMBER_OF_BUILDING; i++) {
            int buildingTemp = Integer.parseInt(br.readLine());
            while (!building.isEmpty()) {
                if (building.peek() <= buildingTemp) {
                    building.pop();
                } else {
                    break;
                }
            }
            answer += building.size();
            building.add(buildingTemp);
        }
        sb.append(answer);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


