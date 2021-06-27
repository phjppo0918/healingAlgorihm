import java.util.*;
import java.io.*;

//import java.math.BigInteger;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;// = new StringTokenizer(br.readLine());
        final int NUMBER_OF_TESTCASE = Integer.parseInt(br.readLine());
        for (int testCase = 0; testCase < NUMBER_OF_TESTCASE; testCase++) {
            int operCount = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int oper = 0; oper < operCount; oper++) {
                st = new StringTokenizer(br.readLine());
                if (st.nextToken().charAt(0) == 'I') {
                    int inputNum = Integer.parseInt(st.nextToken());
                    if (treeMap.containsKey(inputNum)) {
                        treeMap.put(inputNum, treeMap.get(inputNum) + 1);
                    } else {
                        treeMap.put(inputNum, 1);
                    }
                } else {
                    if (!treeMap.isEmpty()) {
                        if (st.nextToken().charAt(0) == '-') {
                            int firstValue = treeMap.firstKey();
                            if (treeMap.get(firstValue) == 1) {
                                treeMap.remove(firstValue);
                            } else {
                                treeMap.put(firstValue, treeMap.get(firstValue) - 1);
                            }
                        } else {
                            int lastValue = treeMap.lastKey();
                            if (treeMap.get(lastValue) == 1) {
                                treeMap.remove(lastValue);
                            } else {
                                treeMap.put(lastValue, treeMap.get(lastValue) - 1);
                            }
                        }
                    }
                }
            }

            if (treeMap.isEmpty()) {
                sb.append("EMPTY");
            } else {
                sb.append(treeMap.lastKey());
                sb.append(" ");
                sb.append(treeMap.firstKey());
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


