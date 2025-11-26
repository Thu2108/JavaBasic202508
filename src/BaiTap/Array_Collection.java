package BaiTap;

import java.util.ArrayList;
import java.util.List;


//- Tạo class mới tại bài tập JAVA BASIC 5 để xử lý bài tập Java Basic 4 với ArrayList
//- Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
//- Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
public class Array_Collection {
    // Hàm tạo thông tin nhân viên và trả về danh sách
    private static ArrayList<String> addEmployee(String name, String age, String jobTitle, String address) {
        ArrayList<String> EmployeeInfor = new ArrayList<>();
        EmployeeInfor.add(name);
        EmployeeInfor.add(age);
        EmployeeInfor.add(jobTitle);
        EmployeeInfor.add(address);
        return EmployeeInfor;// trả về danh sách( hàm có trả về -- đọc kỹ lại đoạn này)
// dùng hàm return nên phải bỏ void trên và dùng hàm arraylist

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add giá trị vào arraylist

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        // duyệt arraylist
        System.out.println("Cách in 1: ===========");
        for (int i = 0; i < list.size(); i++) {// chỗ này nên dùng listsize
            System.out.println(list.get(i));
        }

        // dùng List<String> để bao quát luôn là ko cần biết arraylist , linkedlist,...
        // tạo biến trung gian employee để lấy các giá trị của addemploy
        List<String> employee= addEmployee("Nguyễn Thị Thu", "30", "Auto test", "Thanh Hóa");
        for (String value : employee) {// chỗ này nên dùng listsize
            System.out.println(value);
        }
    }
}
