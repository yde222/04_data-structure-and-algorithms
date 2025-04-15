package com.ohgiraffers.section04.queue;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {

    public String solution(int n, int k){
       Queue<Integer> queue = new LinkedList<>();
       ArrayList<String> answer = new ArrayList<>();
       for(int i = 1; i < n+1; i++){
           queue.offer(i);
       }
       while(!queue.isEmpty()){
           for(int i = 0 ; i <k-1 ;i++){
                int val = queue.poll();
                queue.offer(val);
           }
           answer.add(String.valueOf(queue.poll()));
       }
       return answer.toString();
    }
}

