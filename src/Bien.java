public class Bien {
    String address="Cau Giay_Ha Noi";//bien toan cuc
    static String phone="012345";
    // ham local
    public void sayHello() {
        int n = 10;      // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        //System.out.println(address); // address la bien toan cuc nen ko cho vao dc
    }
    // ham 2
    public void getUser(){
        System.out.println(address);
    }
    public static void main(String[] args) {
        // khai bao mot doi tuong class de khai bao 1 bien toan cuc
        Bien bien= new Bien();
        System.out.println(bien.address);
        System.out.println(phone);
        // khai bao bien
           int a = 12345;
           int b = 246;
           String user="Thu Nguyen";
              System.out.println(a);
        System.out.println(b);
        System.out.println(user);
        bien.sayHello();
    }
}
