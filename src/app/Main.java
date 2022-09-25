package app;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        initVars();
        handleData();
    }

    private static void handleData() {
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = division(a, b);
        System.out.println(e);
        int f = subtraction(a, b);
        System.out.println(f);
    }

    private static void initVars() {
        a = 8;
        b = 2;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }


    private static int division(int a, int b) {
        return a / b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }
}
