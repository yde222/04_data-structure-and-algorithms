package com.ohgiraffers.section04.dp;

/*
 * 파도반 수열
 * 점화식 : f(n) = f(n-2) + f(n-3)
 * */

public class D_Padovan {

    static Integer[] dp = new Integer[101];

    public static int solution(int n) {

        // 초기값 설정
        dp[1] = dp[2] = dp[3] = 1;

        // 1. Top-Down (재귀)
//        return padovan(n);

        // 2. Bottom-Up (반복문)
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    // 메모이제이션
    private static int padovan(int n) {
        if (dp[n] == null) {
            dp[n] = padovan(n - 2) + padovan(n - 3);
        }
        return dp[n];
    }


}
