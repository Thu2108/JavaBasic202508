package DemoCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoCollectionArraylist {
    public static void main(String[] args) {
        // Khai bao du lieu
        // duoc lưu nhiều giá trị trung lap


        // them du lieu
        List<String> menu = new ArrayList<>();
        menu.add("Dashboard");// i=0
        menu.add("Customer");
        menu.add("Information");
        menu.add("Total"); // vị trí thứ i= 3
        menu.add("Location");
        menu.add("Customer");

        // Xoa du lieu ở vị trí thứ 3
        menu.remove(3);


        // Cap nhat du lieu ( thêm dữ liệu ở vị trí thứ 3)
        menu.add(3,"Cố lên Thu ơi");

       // get giá trị theo chỉ muc
        System.out.println(menu.get(3));

        // Kiểm tra dữ liệu




        // Duyệt dữ liệu
        System.out.println("Cách in 1: ===========");
        for (int i=0; i<menu.size(); i++) {
            System.out.println(menu.get(i));
        }


//            System.out.println("Cách in 2:=========");// Cách này ko nên dùng vì phức tạp hơn. Trong khi arraylist đã có chỉ mục
//            int j=0;
//           for(String value:menu){
//               System.out.println(menu.get(j));
//                j++; }

            // Thêm menu 2 nhưng add nguyên menu 1 vào
            System.out.println("*******************");
            List<String> menu2= new ArrayList<>();
            menu2.addAll(menu);

            for (int i=0; i<menu2.size(); i++){
                System.out.println(menu2.get(i));
            }

        }
    }

