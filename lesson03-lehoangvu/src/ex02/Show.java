package ex02;


import java.util.ArrayList;
import java.util.Scanner;


public class Show {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Vehicle> array = new ArrayList<Vehicle>();

    public static void main(String[] args) {
           chooses();

    }

    private static void chooses(){
        int choose = 0;
        do {
            System.out.println("==============Menu==============");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Xuất bản kê khai tiền thuế của các xe");
            System.out.println("3. Thoát");
            do {
                System.out.print(">> Your choose: ");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        nhapthongtin();
                        break;
                    case 2:
                        xuatBanKeKhai();
                        break;

                    case 3:
                        System.out.println("Ban Da Thoat !");
                        break;

                    default:
                        System.out.println("Cu phap Khong Hop le !");
                        break;
                }
            }while(choose !=1 && choose !=2);
        }while(true);
    }

    private static void nhapthongtin(){
        String inputAnother = "";
        do {
            System.out.println("----------Nhập thông tin xe--------");

            System.out.print("Chủ xe: ");
            String chuXe = sc.nextLine();

            System.out.println(" Kiểu Xe: ");
            String kieuXe = sc.nextLine();

            System.out.println(" Dung Tich: ");
            int dungTich = Integer.parseInt(sc.nextLine());

            System.out.println("Gia tri: ");
            double giaTri = Double.parseDouble(sc.nextLine());

            Vehicle v = new Vehicle(chuXe,kieuXe,dungTich,giaTri);
            array.add(v);
            System.out.println("Nhap Thanh Cong : Xe [" + array.get(array.size() - 1)+ "] ");

            System.out.println("Ban Co Muon Nhap Them Mot Chieu Nua khong ? (y/n) ");

            do {
                inputAnother = sc.nextLine();
                if (!inputAnother.equalsIgnoreCase("y") && !inputAnother.equalsIgnoreCase("n")){
                    System.out.println("Vui long nhap lai Yes(y) or No(n)!!");
                    continue;
                }
                break;
            }while (true);
        } while(inputAnother.equalsIgnoreCase("y"));
    }

    private static  void xuatBanKeKhai(){
        if (array.size() == 0){
            System.out.println(" list empty! ");
            sc.nextLine();
            return;
        }

        String alignFormat = "| %-32s | %-10s | %-9d | %,-15.2f | %,-15.2f |%n";
        String alignHeader = "| %-32s | %-10s | %-4s | %-15s | %-15s |%n";
        System.out.format(alignHeader, "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("=================================================================================================");

        for (int i = 0; i < array.size() ; i++) {
            Vehicle bike = array.get(i);
            System.out.format(alignFormat, bike.getOwner(), bike.getType(), bike.getCapacity(), bike.getCost(), bike.getTax());
        }
        sc.nextLine();
    }
}


































