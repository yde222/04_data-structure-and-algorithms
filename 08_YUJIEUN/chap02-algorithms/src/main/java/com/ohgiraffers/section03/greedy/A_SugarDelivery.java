package com.ohgiraffers.section03.greedy;

public class A_SugarDelivery {

    public  static int solution(int n){

        /* 3K와 5Kg로 봉지로 가져갈 수 있는 최소 봉지 수*/
        int count = 0;

        while(true){
            if(n%5==0){
                return n/5 + count;
            }else if(n <0){ // 3or 5 조합으로 해결 안되는 상황
                return -1;
            }else if(n == 0) {
                return count;
            }

            n = n-3;
            count ++;
        }




    }
}
