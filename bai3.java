package baitap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ từ bàn phím: ");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);

        builder.reverse();
        System.out.println("Chuỗi ban đầu: "+ str);
        System.out.println("Chuỗi sau khi đảo ngược: "+ builder);
    }
}
