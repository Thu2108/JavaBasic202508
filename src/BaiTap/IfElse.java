package BaiTap;
//BÀI TẬP PHẦN TOÁN TỬ VÀ ĐIỀU KIỆN IF ELSE

//- Tạo class ôn tập các loại toán tử: quan hệ, logic
//- Tạo ra ít nhất 3 biến bất kỳ lưu giá trị trong class đó
//- Thực hiện các loại toán tử trên các biến trên: &&, ||, >, <, ==


//        "- Tạo biến cố định number = 100
//        - Tạo hàm truyền tham số int ""n"" và Dùng câu lệnh IF Else để đặt điều kiện cho tham số n truyền vào đó:
//       + TH1:  n == number
//       + TH2:  n < number
//       + TH3:  n > number"
//       - Gọi lại hàm trên xuống main để truyền giá trị vào và chạy hàm để kiểm tra
public class IfElse {
    static String Sex="Male";
    static int age=58;
    static int PaymentTimeforInsurance=15;
    public void Condition(int n) {
        int number = 100;
        if (n== number) {
            System.out.println("N bằng" + " " + number);
        } else if (n > number) {
            System.out.println("N lớn hơn" + " " + number);

        } else if (n < number) {
            System.out.println("N nhỏ hơn" + " " + number);

        }}


    public static void main(String[] args) {

if(Sex.equals("Female") && age<=58 && PaymentTimeforInsurance==15 ){
    System.out.println("Nữ giới đủ điều kiện nghỉ hưu");
}else {
    if (Sex.equals("Male") && age <= 60 && PaymentTimeforInsurance == 15) {
        System.out.println("Nam giới đủ điều kiện nghỉ hưu");
    } else if ((age>60 || age<58)||(PaymentTimeforInsurance<15)) {
        System.out.println("Không đủ điều kiện nghỉ hưu");
        
    }

}

        IfElse Test= new IfElse();
        Test.Condition(101);
    }
    }
