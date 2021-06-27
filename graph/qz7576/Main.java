import java.util.*;
import java.io.*;

//import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int ROWS = Integer.parseInt(st.nextToken());
        final int COLS = Integer.parseInt(st.nextToken());

        int tomatoBox[][] = new int[COLS][ROWS];
        int hotTomato[][] = new int[COLS][ROWS];
        Queue<Tomato> tomato = new LinkedList<>();
        for (int i = 0; i < COLS; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < ROWS; j++) {
                tomatoBox[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoBox[i][j] == 1) {
                    tomato.add(new Tomato(i, j));
                }
            }
        }

        while (!tomato.isEmpty()) {
            Tomato tomatoTemp = tomato.poll();

            //상
            if (tomatoTemp.col > 0) {
                if (tomatoBox[tomatoTemp.col - 1][tomatoTemp.row] == 0) {
                    tomatoBox[tomatoTemp.col - 1][tomatoTemp.row] = 1;
                    hotTomato[tomatoTemp.col - 1][tomatoTemp.row] = hotTomato[tomatoTemp.col][tomatoTemp.row] + 1;
                    tomato.add(new Tomato(tomatoTemp.col - 1, tomatoTemp.row));
                }
            }
            //하
            if (tomatoTemp.col < COLS - 1) {
                if (tomatoBox[tomatoTemp.col + 1][tomatoTemp.row] == 0) {
                    tomatoBox[tomatoTemp.col + 1][tomatoTemp.row] = 1;
                    hotTomato[tomatoTemp.col + 1][tomatoTemp.row] = hotTomato[tomatoTemp.col][tomatoTemp.row] + 1;
                    tomato.add(new Tomato(tomatoTemp.col + 1, tomatoTemp.row));
                }
            }

            //좌
            if (tomatoTemp.row > 0) {
                if (tomatoBox[tomatoTemp.col][tomatoTemp.row - 1] == 0) {
                    tomatoBox[tomatoTemp.col][tomatoTemp.row - 1] = 1;
                    hotTomato[tomatoTemp.col][tomatoTemp.row - 1] = hotTomato[tomatoTemp.col][tomatoTemp.row] + 1;
                    tomato.add(new Tomato(tomatoTemp.col, tomatoTemp.row - 1));
                }
            }
            //우
            if (tomatoTemp.row < ROWS - 1) {
                if (tomatoBox[tomatoTemp.col][tomatoTemp.row + 1] == 0) {
                    tomatoBox[tomatoTemp.col][tomatoTemp.row + 1] = 1;
                    hotTomato[tomatoTemp.col][tomatoTemp.row + 1] = hotTomato[tomatoTemp.col][tomatoTemp.row] + 1;
                    tomato.add(new Tomato(tomatoTemp.col, tomatoTemp.row + 1));
                }
            }

        }
        int maxTomato = -1;
        boolean isNoHot = false;
        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                if (tomatoBox[i][j] == 0) {
                    isNoHot = true;
                    break;
                }
                if (maxTomato < hotTomato[i][j]) {
                    maxTomato = hotTomato[i][j];
                }
            }
            if (isNoHot) {
                break;
            }
        }
        if (isNoHot) {
            sb.append(-1);
        } else {
            sb.append(maxTomato);
        }
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}

class Tomato {
    int col;
    int row;

    public Tomato(int col, int row) {
        this.col = col;
        this.row = row;
    }
}


