package baitap;

public class bai2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, java world!");
        System.out.println("Chuỗi ban đầu: "+ str);
        str.delete(5,9);
        System.out.println("Chuỗi sau khi xóa: "+ str);
        str.replace(8,13,"Universe");
        System.out.println("Chuỗi sau khi thay thế: "+ str);
    }
}
