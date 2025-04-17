package com.ohgiraffers.section04.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class F_StairClimbing {

    public static int solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());            // 계단의 개수
        int[] arr = new int[n + 1];                         // 계단별 점수
        int[] dp = new int[n + 1];                          // 최적(최대 점수 합계)의 값 누적

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        return 0;
    }
}
