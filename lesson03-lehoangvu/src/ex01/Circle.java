package ex01;

public class Circle {
    private static java.awt.Point centerCircle;

//
//        double hoanhDoM, tungDoM,hoanhDoTamO, tungDoTamO,banKinhR;
//
//        String viTri;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap vao hoanh do tam O: ");
//        hoanhDoTamO = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Nhap vao tung  do tam O: ");
//        tungDoTamO = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Nhap vao hoanh do diem M:");
//        hoanhDoM= Double.parseDouble(sc.nextLine());
//
//        System.out.println("Nhap vao tung do diem M: ");
//        tungDoM = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Nhap vao ban kinh R: ");
//        banKinhR = Double.parseDouble(sc.nextLine());
//
//        double khoangCachOM = (hoanhDoM - hoanhDoM) * (hoanhDoM - hoanhDoM) + (tungDoM - tungDoTamO) * (tungDoM - tungDoTamO)  ;
//        Double R = banKinhR * banKinhR;
//
//        if(khoangCachOM < R){
//            viTri = "Diem M Nam Ben Trong Duong tron";
//        }
//        else if (khoangCachOM == R){
//            viTri = "Diem M nam Tren Duong Tron";
//        }else
//        {
//            viTri = "Diem M Nam Ben Ngoai Duowng Tron";
//        }
//
//        System.out.println(viTri);
//

//        private  Point centerCircle;
        private static double radius;

    public Circle(Point centerCircle, double radius) {
        centerCircle = centerCircle;
        this.radius = radius;
    }

    public static String check(Point A){
        double length = Math.sqrt(Math.pow(A.getX() - centerCircle.getX(),2) + Math.pow(A.getY() - centerCircle.getY(),2));
        if(length == radius){
            return "A nam tren duong tron!";
        }
       else if (length > radius){
            return "A nam ngoai duong tron!";

        }
       else return "A nam trong duong tron ";
    }
}
