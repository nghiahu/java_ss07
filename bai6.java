package baitap;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        StringBuilder str2 = new StringBuilder("Hello");
        StringBuffer str3 = new StringBuffer("Hello");
        long start = System.currentTimeMillis();

        for(int i = 0; i < 999999; i++) {
            str1 = str1 + "World";
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian chạy của String: "+(end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < 999999; i++) {
            str2.append("World");
        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian chạy của StringBuilder: "+(end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < 999999; i++) {
            str3.append("World");
        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian chạy của StringBuffer: "+(end - start));

    }
}
/*
Thời gian chạy của String: 254921
Thời gian chạy của StringBuilder: 7
Thời gian chạy của StringBuffer: 21
 */

/*
String:
Hiệu suất: Chậm nhất trong ba loại, vì String là immutable (bất biến).
Mỗi lần nối chuỗi, một đối tượng mới được tạo ra, làm tốn bộ nhớ và thời gian xử lý.
Trường hợp sử dụng: Thích hợp cho những chuỗi không thay đổi.

StringBuilder:
Hiệu suất: Nhanh nhất vì là mutable (có thể thay đổi) và không đồng bộ.
Điều này giúp xử lý nhanh trong các trường hợp chỉ có một luồng .
Trường hợp sử dụng: Thích hợp khi cần thực hiện nhiều thao tác trên chuỗi trong các ứng dụng đơn luồng

StringBuffer:
Hiệu suất: Nhanh hơn String, nhưng chậm hơn StringBuilder vì nó là đồng bộ.
Điều này đảm bảo tính an toàn trong môi trường đa luồng .
Trường hợp sử dụng: Dùng trong các ứng dụng đa luồng để đảm bảo dữ liệu không bị xung đột khi nhiều luồng cùng thao tác trên chuỗi.
**/