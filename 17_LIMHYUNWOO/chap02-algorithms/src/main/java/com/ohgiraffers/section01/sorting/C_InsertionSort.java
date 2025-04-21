package com.ohgiraffers.section01.sorting;


import java.util.Arrays;

/* 삽입 정렬
 * 이미 정렬 된 부분에 새로운 요소를 적절한 위치에 삽입하는 방식이다.
 * 왼쪽부터 차례대로 정렬을 확장하며, 새로운 요소가 들어갈 위치를 찾기 위해 비교하며 이동한다.
 * 시간 복잡도는 O(n^2)이지만 데이터가 거의 정렬 된 경우 O(n)까지 최적화 될 수 있다.
 * 적은 데이터나 거의 정렬된 데이터에서 효율적으로 동작한다.
 * */
public class C_InsertionSort {
    public static void solution(int[] arr){
        // 34, 23, 5, 24, 1, 9, 12
        for(int i=1;i<arr.length;i++){
            System.out.println(i + " 번째 : " + Arrays.toString(arr));
            int temp = arr[i]; //중간에 삽입될 값
            int j;
            for(j = i-1; j >= 0 ; j++){
                // i 인덱스보다 앞으로 인덱스를 탑색하면서 기분 값 보다 큰 경우 뒤로 하나씩 인덱스를 밀어낸다.
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            // 반복문을 빠져나왔다는 것은 적절한 삽임 위치를 찾았다는 의미이므로 temp를 삽입한다.
            arr[j+1] = temp;
        }
    }
}
