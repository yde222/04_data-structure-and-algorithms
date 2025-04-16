package com.ohgiraffers.section02.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 완전 탐색(BruteForce) + 백트래킹(Back Tracking)
* 주어진 정수들의 모든 순열(순서 있는 조합)을 구하는 문제
* 가능한 모든 경우의 수를 탐색하는 '완전 탐색' 방식을 사용하지만,
* 백트래킹을 활용하여 이미 사용한 정수를 다시 선택하지 않음으로써 가지치기를 수행하고
* 불필요한 탐색을 줄여 효율적으로 모든 순열의 갯수를 구한다.
* */
public class E_BruteForce {

    // 순열의 총 개수를 저장할 변수
    static int count = 0;
    // 입력 받은 정수 배열
    static int[] nums;
    // 각 정수의 사용 여부를 체크하는 배열
    static boolean[] visited;

    public static Integer solution(String input) {

        StringTokenizer st = new StringTokenizer(input.trim());
        int n = st.countTokens();
        nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[n];
        // 순열의 개수 초기화
        count = 0;

        // 깊이 0에서부터 bactrack 호출
        bactrack(0, n, new ArrayList<>());

        return count;
    }
    /* depth : 현재까지 선택된 정수의 개수*/
    /* n : 전체 정수 개수*/
    private static void bactrack(int depth, int n, ArrayList<Integer> perm) {
        
    }

}
