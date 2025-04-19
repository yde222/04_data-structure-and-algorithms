package com.ohgiraffers.section03.stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class Practice1 {
    // 실제로 코드를 구현
   public String solution(String input){
      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) == '(' ) {
              stack.push(input.charAt(i));
          }else {
              if(stack.isEmpty()){
                  return "NO";
              }
              stack.pop();
              }
          }
      if (!stack.isEmpty()) {
          return "NO";
      }
      return "YES";
   }
}
