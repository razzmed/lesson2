package com.company;

import java.util.Scanner;

public class Main {

    public static int m = 5;

    public static void main(String[] args) {

        int d = printIt(45, 55, 66);
        System.err.println(d);
        m = m + 5;

    }

    public static int printIt(int a, int b, int c) {

        int result = a + b + c;

        m = m + 5;


        return result;


    }
}
