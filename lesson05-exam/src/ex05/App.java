package ex05;

import java.util.Arrays;



/*
 * 	Viết hàm tạo dữ liệu sách cho cửa hàng.
- 	Tạo 3 đối tượng Sách Giáo Khoa
- 	Tạo 2 đối tượng Sách Tham Khảo
- 	Lưu danh sách các đối tượng vào mảng một chiều duy nhất
 */

public class App {
    public static void main(String[] args) {
        Book[] books = getAll();

        // anonymous class
        Function f1 = (Book book) -> {
            return book.getPublisher().contains("NhiDong");
        };

        // (thamso) -> (thanham // override
        Book[] result = getBooks(books, f1);
        show(result);

        Book[] saleBook = {books[0],books[1], books[5]};
        System.out.println("Total of Money:  "+getMoney(saleBook));
    }

    private static double getMoney(Book[] books){
        double totalMoney = 0;
        for (Book book : books){
            double realCost = book.getCost();
            if (book instanceof  TextBook && ((TextBook)book).getStatus().equals(Status.OLD)){
                realCost *= 0.7d;
            }else if(book instanceof ReferenceBook){
                realCost *= (1 + ((ReferenceBook)book).getTax()/100);
            }
            totalMoney += realCost;
        }
        return totalMoney;
    }
    private static Book[] getBooks(Book[] books, Function function) {
        Book[] result = new Book[books.length];
        int i = 0;
        for (Book book : books) {
            if (function.test(book)) {
//               System.out.println(book);
                result[i++] = book;
            }
        }
        return Arrays.copyOfRange(result, 0, i);
    }

    private static Book[] getBooks(Book[] books, String publisher) {
        Book[] result = new Book[books.length];
        int i = 0;
        for (Book book : books) {
            if (book.getPublisher().contains(publisher)) {
//               System.out.println(book);
                result[i++] = book;
            }
        }
        return Arrays.copyOfRange(result, 0, i);

        // Array: fixed- length
        // t2 t3 r1 r2 r4 null null null null null
        // i = 5

        //  Book[] actualResult = new Book[i];
        //     for(int in = 0; in < actualResult.length; in ++)
        //      {
        //     actualResult[in] = result[in];
        //     }
    }

    private static Book[] getBooks(Book[] books, double cost) {
        Book[] result = new Book[books.length];
        int i = 0;
        for (Book book : books) {
            if (book.getCost() < cost) {
//               System.out.println(book);
                result[i++] = book;
            }
        }
        return Arrays.copyOfRange(result, 0, i);
    }

    private static Book[] getBooks(Book[] books, double minCost, double maxCost) {
        Book[] result = new Book[books.length];
        int i = 0;
        for (Book book : books) {
            if (book instanceof TextBook && book.getCost() >= minCost && book.getCost() <= maxCost) {
                result[i++] = book;
            }
        }

        return Arrays.copyOfRange(result, 0, i);
    }
//            if (book.getClass().getSimpleName().equals(TextBook.class.getSimpleName())
//                    && book.getCost() >= minCost
//                    && book.getCost() <= maxCost ) {
////               System.out.println(book);
//                result[i++] = book;


    private static void show(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }

    }

//        }
////    private static void show(Book[] books){
////        for (Book book: books ) {
////            System.out.println(book);
////        }
////    }

        private static Book[] getAll() {
            Book t1 = new TextBook("SGK01", 20, "AuCo", Status.NEW);
            Book t2 = new TextBook("SGK02", 10, "NhiDong", Status.NEW);
            Book t3 = new TextBook("SGK03", 19, "NhiDong", Status.OLD);
            Book t4 = new TextBook("SGK04", 45, "VietNam", Status.OLD);
            Book t5 = new TextBook("SGK05", 24, "AuCo", Status.NEW);

            Book r1 = new ReferenceBook("STK", 68, "NhiDong", 6);
            Book r2 = new ReferenceBook("STK", 78, "NhiDong", 6);
            Book r3 = new ReferenceBook("STK", 46, "VietNam", 12);
            Book r4 = new ReferenceBook("STK", 37, "NhiDong", 6);
            Book r5 = new ReferenceBook("STK", 97, "AuCo", 8);

            return new Book[]{t1, t2, t3, t4, t5, r1, r2, r3, r4, r5};
        }
    }




