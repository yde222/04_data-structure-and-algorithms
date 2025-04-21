package com.ohgiraffers.section07.heap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Practice2Tests {

    Practice2 practice;
    static String input1,input2;
    static int output1,output2;

    @BeforeAll
    public static void setUp() {
        input1 = "21\n"+
                    "5 10\n" +
                    "100 100\n" +
                    "11";
        input2 = "3 2\n" +
                    "1 65\n" +
                    "5 23\n" +
                    " 2 99\n" +
                    "10\n" +
                    "2";

        output1 = 10;
        output2 = 64;
    }

    static Stream<Arguments> provideSource(){
        return Stream.of(

        )
    }

}