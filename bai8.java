package baitap;

import java.util.Random;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        String chars = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int indexChar = (int) (Math.random()*chars.length());
            builder.append(chars.charAt(indexChar));
        }
        System.out.println("Chuỗi ngẫu nhiên: " + builder);
    }
}
