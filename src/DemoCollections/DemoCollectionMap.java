package DemoCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoCollectionMap {
    public static void main(String[] args) {
        // khai bao du lieu
        Map<String, String> map = new HashMap<>();
        Map<Integer, Double> number=new HashMap<>();

        // them dulieu
        map.put("chem","gio");
        map.put("nhiet","tinh");
        number.put(1, 1.56);

        // hàm xoa ( đầu tiên kiểm tra xem key và value có tồn tại hay ko, sau đó mới xóa)
        System.out.println(map.containsKey("chem"));
        System.out.println(map.containsValue("gio"));
        map.remove("nhiet");


        // duyệt

        System.out.println("Map 1: " +map);
        System.out.println("Number:" +number);
        // get hết tất cả giá trị key,value tương ứng
        for (Map.Entry<String,String>entry: map.entrySet()){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
    }
}
