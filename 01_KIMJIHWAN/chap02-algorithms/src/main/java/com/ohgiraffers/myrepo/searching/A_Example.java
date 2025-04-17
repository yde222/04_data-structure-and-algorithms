package com.ohgiraffers.myrepo.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class A_Example {

    static int node, edge;
    static int[][] map;
    static boolean[] visit;
    static int count;

    public static Integer solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        map = new int[node + 1][node + 1];

        visit = new boolean[node + 1];

        StringTokenizer st;
        /* map에 그래프 정보 작성 */
        for (int i = 0; i < edge + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;

            dfsRecursive(1);
//            dfsStack(1);
        }
        return count;
    }

    /***
     * 재귀 함수로 DFS 알고리즘 구현한 메소드
     * @param start
     */
    private static void dfsRecursive(int start) {
        /* 해당 노드를 방문했으므로 방문 배열에 표기 */
        visit[start] = true;

        /* start 노드의 이웃을 탐색하는 과정*/
        for (int i = 1; i <= node; i++) {
            /* start 정점의 이웃 중 방문하지 않은 이웃을 찾는다. */
            if(map[start][i] == 1 && !visit[i]) {
                /* 바이러스를 전파할 이웃 노드를 찾은 것이므로
                * count를 증가시키고 해당 이웃 노드를 방문해서 다시 이웃노드를
                * 재귀적으로 탐색한다.
                * */
                count++;
                dfsRecursive(i);
            }
        }
    }
}
