package BaiTap;

//BÀI TẬP PHẦN VÒNG LẶP FOR VÀ MẢNG

//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//       - Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào
public class LuyenBT {
    public static void main(String[] args) {
        int mang[]=new int[26];
        int index=0;
        for (int i=0; i<=50; i++)
        {if ( i%2==0){
            System.out.print(i + " ");// in số chẵn từ 0 đến 50
            mang[index]=i;
            index++;
        }

    }
        // duyệt mảng
        System.out.println("\n --- Duyệt mảng----");
       for(int value:mang){
           System.out.print(value);
       }

}}

