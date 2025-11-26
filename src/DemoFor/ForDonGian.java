package DemoFor;

public class ForDonGian {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Xin chao" + " " + i);

            // Thêm các condition để giải quyết các bài toán và cụ thể sẽ dừng khi nào
            if (i == 4) {
                break;
            }

        }
    }
}
