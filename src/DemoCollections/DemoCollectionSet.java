package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        // Khai bao kieu du lieu Set
        Set<String> menu= new HashSet<>() ;

        // Them gia tri
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Information");
        menu.add("Total");
        System.out.println("Cac phan tu cua set:");
        System.out.println("\t" + menu + "\n");


        // Thuc hanh mot so ham khac
        System.out.println(menu.contains("Customer"));
        menu.remove("Total");
        System.out.println(menu.size());
        System.out.println("\n================");// muon xuong dong thi dung \n



        // Duyet gia tri trong Set
        // Show list through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Show list through for-each
        System.out.println("\n================");// muon xuong dong thi dung \n
        for (String obj : menu) {
            System.out.println(obj);// neu muon in thanh 1 dong thi print, con neu muon in thanh tung dong thi println


        }
    }

}


