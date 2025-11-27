package Arrays;

public class DemoMang1Chieu_01 {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println("Độ dài mảng" + " " +a.length);
        // duyet mang de lay phan tư ra = for
        // test push code
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        System.out.println("---------");
        for(int i=0;i<a.length;i=i+2) {
            System.out.println(a[i]);
        }
        System.out.println("---------");
            // for cải tiến
            for ( int array:a){
                System.out.println(array);
        }
            //truy xuất giá trị phần tử mảng thủ công
        System.out.println("Lấy giá trị"+ " " +a[4]);

    }
}
