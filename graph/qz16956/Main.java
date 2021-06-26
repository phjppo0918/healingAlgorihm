import java.util.*;
import java.io.*;

//import java.math.BigInteger;
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int COLS = Integer.parseInt(st.nextToken());
        final int ROWS = Integer.parseInt(st.nextToken());
        char field[][] = new char[COLS][ROWS];
        for (int i = 0; i < COLS; i++) {
            field[i] = br.readLine().toCharArray();
        }
        boolean noAnswer = false;
        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                if (field[i][j] == 'W') {
                    try {
                        if (field[i - 1][j] == 'S') {
                            noAnswer = true;
                            break;
                        } else if (field[i - 1][j] == 'W') {

                        } else {
                            field[i - 1][j] = 'D';
                        }

                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field[i + 1][j] == 'S') {
                            noAnswer = true;
                            break;
                        } else if (field[i + 1][j] == 'W') {

                        } else {
                            field[i + 1][j] = 'D';
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field[i][j - 1] == 'S') {
                            noAnswer = true;
                            break;
                        } else if (field[i][j - 1] == 'W') {

                        } else {
                            field[i][j - 1] = 'D';
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }

                    try {
                        if (field[i][j + 1] == 'S') {
                            noAnswer = true;
                            break;
                        } else if (field[i][j + 1] == 'W') {

                        } else {
                            field[i][j + 1] = 'D';
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }


                }
            }
            if (noAnswer) {
                break;
            }
        }

        if (noAnswer) {
            sb.append(0);
        } else {
            sb.append("1\n");
            for (int i = 0; i < COLS; i++) {
                for (int j = 0; j < ROWS; j++) {
                    sb.append(field[i][j]);
                }
                sb.append("\n");
            }
        }

        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


