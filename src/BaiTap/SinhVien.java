package BaiTap;
// Tạo project mới dành cho bài tập
//Tạo class: SinhVien, ThongTin
// Class SinhVien: khai báo 3 loại biến (local, instance, static) gọi lại in ra ở hàm main
// Class ThongTin: khai báo các biến static để gọi lại ở class SinhVien và in ra thông tin


import java.awt.image.LookupOp;
import java.sql.SQLOutput;

public class SinhVien {
    static String Truong = "Hoc vien Tai Chinh";// bien static
    String Lop = "CQ52/41.04"; // bien toan cuc

    public void SinhVien() {
        String Sinhvien = "Nguyen Thi Thu";// Bien local
        System.out.println(Sinhvien);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.SinhVien();
        System.out.println(Truong);
        System.out.println(sv.Lop);
//        ThongTin.setThuongTru("Thanh Hoa");
//        ThongTin.setNgaySinh("08-08-1999");
//        ThongTin.setPhone("0362223456");

        // Goi tu class Thong tin
        System.out.println(ThongTin.THUONGTRU);
        System.out.println(ThongTin.PHONE);

    }


}
