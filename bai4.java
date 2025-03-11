package baitap;

import java.util.Locale;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhập vào một chuỗi: ");
       String str = scanner.nextLine();
       StringBuilder builder = new StringBuilder(str.toLowerCase(Locale.ROOT));
       if(builder.reverse().toString().equals(str.toLowerCase())){
           System.out.println("Chuỗi đối xứng");
       }else {
           System.out.println("Chuỗi không đối xứng");
       }
    }
}
