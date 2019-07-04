package com;

public class application {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            total += x;
        }
        System.out.println(total);
    }


}

