package com.xgn.demo1;

public class GetSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("和为："+sum);
    }
}
