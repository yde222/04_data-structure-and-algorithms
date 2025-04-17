package com.ohgiraffers.section03.greedy;

/*
* 다익스트라 알고리즘
* 음의 가중치가 없는 그래프의 한 정점에서 모든 정점까지의 최단거리를 구하는 알고리즘
* 간선에 가중치가 없으면 BFS로도 가능하지만, 가중치가 있다면 최단경로 보장이 어렵다.*/
public class D_DijkstarAlgorithm {

  static int n,m,start;     // 정점개수, 간선 개수, 시작 정점
  static int[] dis;         // 다른 노드까지의 거리를 저장할 배열

  static class Edge implements Comparable<Edge> {
    int var;
    int cost;
    Edge(int var, int cost) {
      this.var = var;
      this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
      return this.cost - o.cost;  // 가중치 오름차순의 우선순위
    }

    public static String solution(String input){
      return null;
    }

  }
}
