package com.ohgiraffers.section07.heap;

import com.ohgiraffers.section03.stack.Practice2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
/* 보석도둑 - 백준(1202) */
class Practice2Tests {

    Practice2 practice2;
    static String input1, input2;
    static int output1, output2;

    @BeforeAll
    public static void set() {
        input1 = "2 1\n" +
                "5 10\n" +
                "100 100\n" +
                "11";

        input2 = "3 2\n" +
                "1 65\n" +
                "5 23\n" +
                "2 99\n" +
                "10\n" +
                "2";

        output1 = 10;
        output2 = 164;
    }

    static Stream<Arguments> provideSource() {
        return Stream.of(
                
        )
    }
}