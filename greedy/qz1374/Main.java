import java.util.*;
import java.io.*;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int NUMBER_OF_LECTURE = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arrayList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_LECTURE; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            long start = Long.parseLong(st.nextToken());
            long end = Long.parseLong(st.nextToken());
            arrayList.add(new Lecture(start, end));
        }
        Collections.sort(arrayList);

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(arrayList.get(0).end);
        int roomCount = 1;
        for (int i = 1; i < NUMBER_OF_LECTURE; i++) {
            if (priorityQueue.peek() <= arrayList.get(i).start) {
                priorityQueue.poll();
            } else {
                roomCount++;
            }
            priorityQueue.add(arrayList.get(i).end);
        }
        sb.append(roomCount);
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}

class Lecture implements Comparable<Lecture> {
    long start;
    long end;

    public Lecture() {
    }

    public Lecture(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Lecture member) {
        if (this.start > member.start) {
            return 1;
        } else if (this.start < member.start) {
            return -1;
        } else {
            return 0;
        }
    }
}

