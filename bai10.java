package baitap;

import java.util.Locale;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);
        do{
            System.out.println("==========MENU QUẢN LÝ CHUỖI=========");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kỳ");
            System.out.println("3. Xóa một đoạn trong chuỗi");
            System.out.println("4. Thay thế một đoạn trong chuỗi");
            System.out.println("5. Chuyển toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    builder.reverse();
                    System.out.println("Chuỗi sau khi đảo ngược: " + builder);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Nhập vào chuỗi cần chèn: ");
                    String strInsert = scanner.nextLine();
                    System.out.print("Nhập vào vị trí cần chèn: ");
                    int index = scanner.nextInt();
                    builder.insert(index, strInsert);
                    System.out.println("Chuỗi sau khi chèn: " + builder);
                    break;
                case 3:
                    System.out.print("Nhập vị trí bắt đầu xóa: ");
                    int start = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc xóa: ");
                    int end = scanner.nextInt();
                    builder.delete(start, end);
                    System.out.println("Chuỗi sau khi xóa: " + builder);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập chuỗi thay thế: ");
                    String replaceStr = scanner.nextLine();
                    System.out.print("Nhập vị trí bắt đầu thay thế: ");
                    start = scanner.nextInt();
                    System.out.print("Nhập vị trí kết thúc thay thế: ");
                    end = scanner.nextInt();
                    builder.replace(start, end, replaceStr);
                    System.out.println("Chuỗi sau khi thay thế: " + builder);
                    break;
                case 5:
                    System.out.print("Chuyển chuỗi thành (0: Viết hoa / 1: Viết thường) :");
                    int isUpLow = scanner.nextInt();
                    if(isUpLow == 0){
                        builder = new StringBuilder(builder.toString().toUpperCase());
                        System.out.println("Chuỗi sau khi viết hoa: " + builder);
                    } else if (isUpLow == 1) {
                        builder = new StringBuilder(builder.toString().toUpperCase());
                        System.out.println("Chuỗi sau khi viết thường: " + builder);
                    }else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
        }while (true);
    }
}
