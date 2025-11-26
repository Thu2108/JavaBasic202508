package Condition;

public class DemoIfElseIf {
    public static void main(String[] args) {
        double diem = 3.7;
        if ((diem < 0) || (diem > 10)) {
            System.out.println("Khong hop le");

        } else {
            if ((diem >= 3.6) && (diem <= 4)) {
                System.out.println("Xep loại Xuất sắc");
            } else if ((diem < 3.6) && (diem > 3.2)) {
                System.out.println("Xep loại Giỏi");

            } else if ((diem < 3.2) && (diem > 2.5)) {
                System.out.println("Xep loại Khá");

            } else if ((diem < 2.5) && (diem > 2.0)) {
                System.out.println("Xep loại Trung bình");

            } else if ((diem < 1.5)) {
                System.out.println("Tạch");

            }


        }
    }
}
