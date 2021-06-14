import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        final BigInteger NUMBER_OF_DICE = new BigInteger(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int diceInput[] = new int[6];
        for (int i = 0; i < 6; i++) {
            diceInput[i] = Integer.parseInt(st.nextToken());

        }
        int dice[] = new int[3];
        //   D - C   E - B   A -F
        dice[0] = Math.min(diceInput[2], diceInput[3]);
        dice[1] = Math.min(diceInput[1], diceInput[4]);
        dice[2] = Math.min(diceInput[0], diceInput[5]);
        Arrays.sort(dice);

        BigInteger answer = BigInteger.ZERO;

        //꼭지점 3면째
        answer = answer.add(BigInteger.valueOf(dice[2] * 4));

        //모서리
        // answer += dice[1] * (NUMBER_OF_DICE + NUMBER_OF_DICE - 2) * 4;
        answer = answer.add(BigInteger.valueOf(dice[1])
                .multiply(NUMBER_OF_DICE
                        .add(NUMBER_OF_DICE)
                        .subtract(BigInteger.valueOf(2)))
                .multiply(BigInteger.valueOf(4)));
        //나머지 1면
        /*
        answer += dice[0] *
                (NUMBER_OF_DICE * NUMBER_OF_DICE * 2
                        + (NUMBER_OF_DICE * (NUMBER_OF_DICE - 2)) * 2
                        + (NUMBER_OF_DICE - 2) * (NUMBER_OF_DICE - 2));

*/
        answer = answer.add(BigInteger.valueOf(dice[0])
                .multiply(
                        NUMBER_OF_DICE
                                .multiply(NUMBER_OF_DICE)
                                .multiply(BigInteger.valueOf(2))
                                .add(
                                        NUMBER_OF_DICE
                                                .multiply(NUMBER_OF_DICE
                                                        .subtract(BigInteger.valueOf(2)))
                                                .multiply(BigInteger.valueOf(2))
                                )
                                .add(
                                        NUMBER_OF_DICE.subtract(BigInteger.valueOf(2))
                                                .multiply(NUMBER_OF_DICE.subtract(BigInteger.valueOf(2)))
                                )
                ));

        if (NUMBER_OF_DICE.compareTo(BigInteger.ONE) == 0) {
            int maxDice = -1;
            int total = 0;
            for (int i : diceInput) {
                total += i;
                if (i > maxDice) {
                    maxDice = i;
                }
            }
            sb.append(total - maxDice);
        } else {
            sb.append(answer.toString());
        }

        sb.append("\n");


        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

