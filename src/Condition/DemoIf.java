package Condition;

import java.sql.SQLOutput;

public class DemoIf {
    public static void main(String[] args) {
        int age = 20;
        String header="Login CRM";
        String gender = "Nam";
        // so sánh bằng trong chuỗi dùng hàm equals()
        //so sánh bằng trong chuỗi dùng hàm contains()
        if ((age >= 20) && gender.equals("Nam")) {
            System.out.println("Nam đủ điều kiện kết hôn");
        }
        if (header.contains("Login")) {
            System.out.println("Đã đến được trang login");
        }
    }
}
