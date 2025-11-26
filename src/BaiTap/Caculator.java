package BaiTap;

// *** Tại class Calculator:
//        - Tạo hàm tính tổng 2 số nguyên
//- Tạo hàm tính tích 2 số thực
//*** Gọi lại 2 hàm trên và truyền tham số vào dưới hàm main để chạy

public class Caculator {
    public int sum;
    public double  mul;
//    public void  Tong(int a, int b){// Ham ko tra về kết quả
//        sum = a+b;
//        System.out.println(sum);// vì là dùng hàm public void là hàm ko trả về kết quả nên trong hàm phải tự in ra bằng lệnh sout
//    }

    public int Tong(int a, int b){
        sum=a+b;
        return(sum);
    }

    // dùng hàm có trả về kết quả như hàm Nhan

    public double  Nhan(double  a, double  b){
        mul = a*b;
        return(mul) ;
    }

    public static void main(String[] args) {
        Caculator pheptinh=new Caculator();
//        pheptinh.Tong(15,20);//nếu dùng hàm public void thì viết kiểu này
        System.out.println(pheptinh.Tong(5,10));
        System.out.println(pheptinh.Nhan(5.5,6.0));

    }
}
