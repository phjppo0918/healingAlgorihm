import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_DIGITS = Integer.parseInt(st.nextToken());
        int deleteCount = Integer.parseInt(st.nextToken());
        char input[] = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int pivot;

        for (pivot = 0; pivot < NUMBER_OF_DIGITS; pivot++) {
            int inputTemp = input[pivot] - '0';
            while (!stack.isEmpty() && stack.peek() < inputTemp && deleteCount != 0) {
                stack.pop();
                deleteCount--;
            }
            stack.push(inputTemp);
        }
        while (deleteCount != 0) {
            stack.pop();
            deleteCount--;
        }
        Stack<Integer> answer = new Stack<>();
        for (int i : stack) {
            answer.push(i);
        }
        for (int i : answer) {
            sb.append(i);
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}