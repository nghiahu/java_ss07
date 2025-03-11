package baitap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 chuỗi");
        String str1,str2,str3;
        System.out.print("str1: ");
        str1 = scanner.nextLine();
        System.out.print("str2: ");
        str2 = scanner.nextLine();
        System.out.print("str3: ");
        str3 = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);
        builder.append(str3);

        System.out.println("Kết quả: "+ builder.toString().toUpperCase());
    }
}
