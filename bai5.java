package baitap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String str = scanner.nextLine().trim();
        String[] strArr = str.split( "\\s+");
        StringBuilder result = new StringBuilder();
        for (String i : strArr) {
            StringBuilder builder = new StringBuilder(i);
            builder.reverse();
            result.append(builder);
            result.append(" ");
        }
        System.out.println("Kết quả: " + result);
    }
}
