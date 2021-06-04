import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //  StringTokenizer st = new StringTokenizer(br.readLine());

        String timeString[] = br.readLine().split(":");
        int hh = Integer.parseInt(timeString[0]);
        int mm = Integer.parseInt(timeString[1]);
        hh %= 24;
        mm %= 60;
        int minHH = 100;
        int minMM = 100;
        int minMove = 9999999;
        for (int i = hh; i < 100; i += 24) {
            Btn btn1 = new Btn(i / 10);
            Btn btn2 = new Btn(i % 10);
            int gapOneToTwo = btn1.moveCount(btn2);
            for (int j = mm; j < 100; j += 60) {
                Btn btn3 = new Btn(j / 10);
                Btn btn4 = new Btn(j % 10);
                int gapTwoToThree = btn2.moveCount(btn3);
                int gapThreeToFour = btn3.moveCount(btn4);
                if (gapOneToTwo + gapTwoToThree + gapThreeToFour < minMove) {
                    minHH = i;
                    minMM = j;
                    minMove = gapOneToTwo + gapTwoToThree + gapThreeToFour;
                }
            }
        }
        if (minHH < 10) {
            sb.append(0);
        }
        sb.append(minHH);
        sb.append(":");
        if (minMM < 10) {
            sb.append(0);
        }
        sb.append(minMM);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

}

class Btn {
    int x, y;

    public Btn() {
    }

    public Btn(int a) {
        switch (a) {
            case 1:
                x = 1;
                y = 1;
                break;
            case 2:
                x = 2;
                y = 1;
                break;
            case 3:
                x = 3;
                y = 1;
                break;
            case 4:
                x = 1;
                y = 2;
                break;
            case 5:
                x = 2;
                y = 2;
                break;
            case 6:
                x = 3;
                y = 2;
                break;
            case 7:
                x = 1;
                y = 3;
                break;
            case 8:
                x = 2;
                y = 3;
                break;
            case 9:
                x = 3;
                y = 3;
                break;
            case 0:
                x = 2;
                y = 4;
                break;
        }
    }

    public int moveCount(Btn btn) {
        int xGap = this.x - btn.x;
        int yGap = this.y - btn.y;
        if (xGap < 0) {
            xGap *= -1;
        }
        if (yGap < 0) {
            yGap *= -1;
        }
        return xGap + yGap;
    }
}


