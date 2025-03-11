package baitap;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        if(str.isEmpty()){
            System.out.println("");
        }else {
            StringBuilder builder = new StringBuilder(str);
            for (int i = 0; i < builder.length(); i++) {
                if(i != 0 && Character.isUpperCase(builder.charAt(i))){
                    builder.insert(i,"_");
                    i++;
                }
            }
            System.out.println("Kết quả: " + builder.toString().toLowerCase());
        }
    }
}
