package StaticJava;

import java.sql.SQLOutput;
import java.util.Locale;

public class XuLyChuoi {
    public static void main(String[] args) {
        String S1="Theo người dân địa phương, sở dĩ có tên gọi như vậy là bởi món bánh này thoạt nhìn khá giống trứng con cáy";
        String S2="Song, cũng có người nói, thuở xưa, bánh cáy được đem tiến vua. Vua ăn thấy có vị bùi, ngọt hòa cùng vị cay nên hỏi tên bánh";

        // Cắt chuỗi
        System.out.println(S1.substring(10));
        System.out.println(S1.substring(10,20));


        // Ghép chuỗi
        System.out.println(S1+ ". " + S2);



        // Chuyển chuỗi in hoa thường

        System.out.println(S1.toUpperCase(Locale.ROOT));
        System.out.println(S1.toLowerCase(Locale.ROOT));

        // Xóa ký tự khoảng trắng
          String S3=" Test automation ";
        System.out.println(S3.trim());

        // Tính độ dài chuỗi
        System.out.println("Độ dài chuỗi S2 là:"+ " "+ S2.length());

        if (S1.length()>S2.length()) {
            System.out.println("S1 dài hơn S2");
        }
            else {
                System.out.println("S2 dài hơn S1");
            }

            // Tìm kiếm ký tự
        System.out.println(S2.charAt(15));


        // so sánh chuỗi
        // + So sánh bằng
        System.out.println(S1.equals(S2));
        // + so sánh chứa
        System.out.println(S2.contains("bánh cáy"));

        // + so sánh bỏ qua Hoa thường
        System.out.println(S1.equalsIgnoreCase("CON CÁY"));
    }
}

