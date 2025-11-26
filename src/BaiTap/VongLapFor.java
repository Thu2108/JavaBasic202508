package BaiTap;
//BÀI TẬP PHẦN VÒNG LẶP FOR VÀ MẢNG

//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//       - Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào

public class VongLapFor {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  "); // in theo hàng dọc thì dùng println, in theo hàng ngang thì dùng print
                mangSoNguyen[index] = i;// gán giá trị số chẵn vào vị trí mảng tuần tự
                index++;// tăng biến chỉ mục lên một đơn vị
            }

        }
        // duyệt mảng
        for (int value : mangSoNguyen) {
            System.out.println(value);
        }
    }
}
