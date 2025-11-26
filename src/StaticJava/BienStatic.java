package StaticJava;

public class BienStatic {
    //int count =0; // bien khong chua static
    static int count = 0; // Bien chua static. Nen chi goi lay gia tri 1 lan

    BienStatic() {  // Neu tao mot class ko chua void hay return thi khai bao ten ham= ten class
        count++; // lay gia tri o thoi diem dang co chu ko goi lai bien tu dau
        System.out.println(count);
    }


    public static void main(String args[]) {

        BienStatic c1 = new BienStatic();// goi ham lan 1
        BienStatic c2 = new BienStatic();// goi ham lan 2
        BienStatic c3 = new BienStatic();// goi ham lan 3

    }
}
