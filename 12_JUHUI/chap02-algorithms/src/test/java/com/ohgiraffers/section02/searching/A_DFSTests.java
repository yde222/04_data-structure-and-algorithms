package com.ohgiraffers.section02.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

class A_DFSTests {

    static String input;
    static Integer output;

    @BeforeAll
    static void setUp() {
        input = "7\n" + // 노드 수
                "6\n" + // 간선 수
                "1 2\n" + // 가는 방향
                "2 3\n" +
                "1 5\n" +
                "5 2\n" +
                "5 6\n" +
                "4 7";
        output = 4;
    }

    static Stream<Arguments> provideSource () {
        return Stream.of(
                Arguments.arguments(input,output)
        );
    }

    @DisplayName("dfs")
    @ParameterizedTest
    @MethodSource("provideSource")
    void dfsTest(String input,Integer output) throws IOException {
        Integer result = A_DFS.solution(input);
        Assertions.assertEquals(output, result);
    }
}