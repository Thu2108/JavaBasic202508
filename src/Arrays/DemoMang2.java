package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {
        //Khai bao va gan gia tri cho mang

        int number2[]={5,7,10,20,30};  //Không cần chỉ định kích cỡ mảng ban đầu là bao nhiêu, thêm vào bao nhiêu là hiểu bấy nhiêu
        number2[2]=100;
        for (int i=0; i< number2.length; i++){
            System.out.println(number2[i]);
        }
        System.out.println("Độ dài mảng:"+" " +number2.length);


    }
}
