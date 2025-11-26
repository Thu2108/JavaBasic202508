public class Ham {
    public double sum;
    public double res;

    // ham ko tra ve
    public void CongHaiso() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }

    //Ham co tra ve
    public double nhanHaiSo() {
        int c = 6;
        int d = 7;
        res = c * d;
        return res;
    }

    // ham khong tra ve co tham so
    public void congHaiSo(int number1, int number2) {
        sum = number1 + number2;
        System.out.println(sum);
    }

    public double nhan2so(int a, int b, int c) {
        res = a * b * c;
        return res;
    }


    public static void main(String[] args) {
        Ham ham = new Ham();
        ham.CongHaiso();
        // System.out.println(ham.CongHaiso()+5); -- Ham ko tra ve nen ko duoc
        ham.nhanHaiSo();
        System.out.println(ham.nhanHaiSo());
        System.out.println(ham.nhanHaiSo() + 5);// ham co tra ve nen cong tiep dc voi 5
        ham.congHaiSo(10,20);
        ham.nhan2so(5,2,10);
        System.out.println(ham.nhan2so(5,2,10));
        System.out.println(ham.nhan2so(5,2,10)/5);
    }

}
