package com.practice.www;

public class local {
    public static void exampleMethod() {
        // Local variable
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        local example = new local();
        local.exampleMethod();

    }
}

