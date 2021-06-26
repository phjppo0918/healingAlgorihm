import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int FIELD_SIZE = Integer.parseInt(br.readLine());
        int field[][] = new int[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<Reach> reachQueue = new LinkedList<>();
        boolean visited[][] = new boolean[FIELD_SIZE][FIELD_SIZE];

        reachQueue.add(new Reach(0, 0));
        boolean canFinish = false;
        while (!reachQueue.isEmpty()) {
            Reach reachTemp = reachQueue.poll();
            if (visited[reachTemp.cols][reachTemp.rows]) {
                continue;
            }
            int jumpPower = field[reachTemp.cols][reachTemp.rows];
            if (jumpPower == -1) {
                canFinish = true;
                break;
            }

            visited[reachTemp.cols][reachTemp.rows] = true;
            if (reachTemp.cols + jumpPower < FIELD_SIZE) {
                reachQueue.add(new Reach(reachTemp.cols + jumpPower, reachTemp.rows));
            }

            if (reachTemp.rows + jumpPower < FIELD_SIZE) {
                reachQueue.add(new Reach(reachTemp.cols, reachTemp.rows + jumpPower));
            }
        }

        if (canFinish) {
            sb.append("HaruHaru");
        } else {
            sb.append("Hing");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

class Reach {
    int cols;
    int rows;

    public Reach(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }
}


