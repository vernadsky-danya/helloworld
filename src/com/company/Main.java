package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
public static Scanner in = new Scanner (System.in);
public static PrintStream out =  System.out;
    public static void main(String[] args) {
	int a;
        a = in.nextInt();
int b= 2 << a-1;
        out.println(b);
    }
}
 