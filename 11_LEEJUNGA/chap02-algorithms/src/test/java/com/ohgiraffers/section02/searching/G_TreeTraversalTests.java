package com.ohgiraffers.section02.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class G_TreeTraversalTests {
    private static String input1;
    private static String output1;

    @BeforeAll
    public static void set() {


        /*
         *     A
         *   /   \
         *   B    C
         *  /    /  \
         * D    E    F
         *            \
         *             G
         * */

        input1 = "7\n" +
                "A B C\n" +
                "B D .\n" +
                "C E F\n" +
                "E . .\n" +
                "F . G\n" +
                "D . .\n" +
                "G . .";
        output1 = "ABDCEFG\n" +
                "DBAECFG\n" +
                "DBEGFCA";

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)
        );
    }

    @DisplayName("tree2")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void treeTest(String input, String output) throws IOException {
        String result = G_TreeTraversal.solution(input);
        Assertions.assertEquals(output, result);
    }

}