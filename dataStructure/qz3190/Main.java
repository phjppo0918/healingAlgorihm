import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {
    public static int board[][];
    public static final int TOP = 3,
            BOTTOM = 1,
            LEFT = 2,
            RIGHT = 0,
            DEADLINE = -1,
            EMPTY = 0,
            SNAKE = 1,
            APPLE = 2;
    public static Queue<SnakeLocation> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());

        final int BOARD_SIZE = Integer.parseInt(br.readLine());

        board = new int[BOARD_SIZE + 2][BOARD_SIZE + 2];
        for (int i = 0; i < BOARD_SIZE + 2; i++) {
            board[0][i] = DEADLINE;
            board[BOARD_SIZE + 1][i] = DEADLINE;
            board[i][0] = DEADLINE;
            board[i][BOARD_SIZE + 1] = DEADLINE;
        }

        //apple
        final int NUMBER_OF_APPLE = Integer.parseInt(br.readLine());
        for (int i = 0; i < NUMBER_OF_APPLE; i++) {
            st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            board[col][row] = APPLE;
        }
        int head = RIGHT;

        queue.add(new SnakeLocation(1, 1));

        final int NUMBER_OF_ACT = Integer.parseInt(br.readLine());
        int playTime = 0;
        boolean gameEnd = false;
        int headCol = 1;
        int headRow = 1;
        int actCount = 0;
        while (actCount < NUMBER_OF_ACT) {
            st = new StringTokenizer(br.readLine());
            int movingTime = Integer.parseInt(st.nextToken()) - playTime;
            char handle = st.nextToken().charAt(0);
            switch (head) {
                case RIGHT:
                    for (int i = 0; i < movingTime; i++) {
                        playTime++;
                        headRow++;
                        gameEnd = moveSnake(headCol, headRow);

                        if (gameEnd) {
                            break;
                        }
                    }
                    break;
                case BOTTOM:
                    for (int i = 0; i < movingTime; i++) {
                        playTime++;
                        headCol++;
                        gameEnd = moveSnake(headCol, headRow);

                        if (gameEnd) {
                            break;
                        }
                    }
                    break;
                case LEFT:
                    for (int i = 0; i < movingTime; i++) {
                        playTime++;
                        headRow--;
                        gameEnd = moveSnake(headCol, headRow);

                        if (gameEnd) {
                            break;
                        }
                    }
                    break;
                case TOP:
                    for (int i = 0; i < movingTime; i++) {
                        playTime++;
                        headCol--;
                        gameEnd = moveSnake(headCol, headRow);

                        if (gameEnd) {
                            break;
                        }
                    }
                    break;
            }


            if (gameEnd) {
                break;
            }

            if (handle == 'D') {
                head++;
                if (head == 4) {
                    head = RIGHT;
                }
            } else {
                head--;
                if (head == -1) {
                    head = TOP;
                }
            }
            actCount++;
        }
        if (!gameEnd) {
            switch (head) {
                case RIGHT:
                    while (!gameEnd) {
                        playTime++;
                        headRow++;
                        gameEnd = moveSnake(headCol, headRow);
                    }
                    break;
                case LEFT:
                    while (!gameEnd) {
                        playTime++;
                        headRow--;
                        gameEnd = moveSnake(headCol, headRow);
                    }
                    break;
                case TOP:
                    while (!gameEnd) {
                        playTime++;
                        headCol--;
                        gameEnd = moveSnake(headCol, headRow);
                    }
                    break;
                case BOTTOM:
                    while (!gameEnd) {
                        playTime++;
                        headCol++;
                        gameEnd = moveSnake(headCol, headRow);
                    }
                    break;
            }
        }

        sb.append(playTime);
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }

    public static boolean moveSnake(int col, int row) {
        switch (board[col][row]) {
            case EMPTY:
                SnakeLocation sl = queue.poll();
                board[sl.col][sl.row] = 0;
            case APPLE:
                queue.add(new SnakeLocation(col, row));
                board[col][row] = 1;
                break;
            case SNAKE:
            case DEADLINE:
                return true;
        }

        return false;
    }


}

class SnakeLocation {
    int col;
    int row;

    public SnakeLocation() {
    }

    public SnakeLocation(int col, int row) {
        this.col = col;
        this.row = row;
    }
}


