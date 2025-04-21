package com.ohgiraffers.section04.dp;

/*
 * 파도반 수열
 * 점화식 : f(n) = f(n-2) + f(n-3)
 * */
public class D_Padovan {
    static Integer[] dp = new Integer[101];

    public static int solution(int n) {
        // 초기 값 설정
        dp[1] = dp[2] = dp[3] = 1;

        // 1. 탑다운 방식 (재귀호출)
//        int result = padovan(n);

        // 2. 바텀업 방식(반복문)
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }
        int result = dp[n];

        return result;
    }

    private static int padovan(int n) {
        if (dp[n] == null) {
            dp[n] = padovan(n - 2) + padovan(n - 3);
        }
        return dp[n];
    }


}
