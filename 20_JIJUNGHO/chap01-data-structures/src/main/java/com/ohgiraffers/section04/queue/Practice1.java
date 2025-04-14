package com.ohgiraffers.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {

    public String solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i <= n; i++) {
            queue.offer(i);
        }

        return null;
    }

}
