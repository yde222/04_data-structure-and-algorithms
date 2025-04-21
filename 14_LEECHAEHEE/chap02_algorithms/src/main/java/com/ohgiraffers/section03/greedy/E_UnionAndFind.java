package com.ohgiraffers.section03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 *
 *
 */
public class E_UnionAndFind {
    static int[] parent;

    /* 특정 원소가 속한 집합을 찾는 연산 */
    static int find(int x) {
        /* 집합의 대표 원소 (루트 노드) 를 찾고
         * 대표 원소를 알면 두 원소가 같은 집합에 속하는지 알 수 있다. */
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    /* 두 개의 집합을 하나로 합치는 연산
     * 두 집합의 대표 원소를 비교하여 두 집합이 연결 되도록 한다. */
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        // 앞쪽 원소를 root로 하는 기준으로 작성하면
        if(rootX != rootY) parent[rootY] = rootX;
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st;

        // 학생 수와 관계 읽어오기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 학생 수
        int M = Integer.parseInt(st.nextToken());   // 제공 된 학생 쌍

        // parent 배열 초기화 (처음에는 각각의 요소가 별도의 집합으로 구성)
        parent = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        // M개의 학생 쌍 처리
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);    // a 학생과 b 학생을 같은 집합으로 만듦
            System.out.println("union(" + a + "," + b + ")");
            System.out.println("parent : " + Arrays.toString(parent));
        }

        // 마지막 쌍의 친구 관계 확인
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if(find(x) == find(y)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
