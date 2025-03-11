package baitap;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            } else if (str.charAt(i) != str.charAt(i-1)) {
                builder.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        builder.append(str.charAt(str.length()-1)).append(count);
        System.out.println("Chuỗi sau khi nén: "+ builder);
    }
}
