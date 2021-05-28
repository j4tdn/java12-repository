package shopping;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        /*
        c1: KH1, vule , 123, daNang
        c2: KH2, mydung, 456, daklak

        i1: SS10+, android, black , 620
        i2: SS20+, Android, Green, 840
        i3: IP8, IOS , While ,999
        i4: IP12 ,IOS , black , 1111
            i5: WP8, WindowPhone, Blue, 666
         */

        Customer c1 = new Customer("KH1", "VuLe","123","DaNang");
        Customer c2 = new Customer("KH2", "Kate","456","California");

        Item i1 = new Item(" SS10+"," android"," black",620.0);
        Item i2 = new Item("SS20+","Android"," Green", 840.0);
        Item i3 = new Item("IP8 "," IOS"," black",999.0);
        Item i4 = new Item(" IP12","IOS "," ",1111.1);
        Item i5 = new Item(" WP8"," WindowPhone"," Blue",666.0);// order


        Order o1 = new Order(c1,new ItemDetail[]{
                new ItemDetail(i1,3),
                new ItemDetail(i4,5),
                new ItemDetail(i2,1)
        },
                LocalDateTime.of(2021,5,28,10,10,10));

        Order o2 = new Order(c2,new ItemDetail[]{
                new ItemDetail(i3,2),
                new ItemDetail(i5,1),
                new ItemDetail(i2,1)
        },
                LocalDateTime.of(2021,5,28,11,10,10));

        Order o3 = new Order(c2,new ItemDetail[]{
                new ItemDetail(i4,1),


        },
                LocalDateTime.of(2021,5,28,5,10,10));

        OrderUtils out = new OrderUtils();
        System.out.println("Order 1:"+OrderUtils.export(o1));



//        Write methods export in order class : no-parameter
//        Write methods export in Another class : export(order)








    }
}
