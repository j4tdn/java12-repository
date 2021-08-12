package bt2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
	  static Scanner sc = new Scanner(System.in);
	  static void nhapCD(CD cd) {
		  System.out.println("Nhap ma CD: ");
		  cd.setMaCD(sc.nextInt());
		  sc.nextLine();
		  System.out.print("Nhap ten CD : ");
	      cd.setTypeCD(sc.nextLine());
	      System.out.print("Nhap ten ca si : ");
	      cd.setSinger(sc.nextLine());
	      System.out.print("Nhap so luong bai hat : ");
	      cd.setSingNumbers(sc.nextInt());
	      System.out.print("Nhap gia thanh : ");
	      cd.setPrice(sc.nextFloat());
	  }

	public static void main(String[] args) {
		CD[] cds = null;
		int input,n = 0;
		boolean flag = true;
		do {
			System.out.println("What's your Choice ?");
			 System.out.println("1.Nhập thông tin CD \n" +
	                    "2.Hien thi danh sách CD.\n" + "3.Tổng số lượng CD \n" + "4.Tính tổng giá thành \n" +
	                    "5.Sắp xếp giảm dần theo giá thành\n"+"6.Sắp xếp tăng dần theo tựa CD\n"+"Nhập số khác để thoát");
	            input = sc.nextInt();
	            switch (input) {
				case 1: {
					System.out.println("Nhap so luong CD : ");
					n = sc.nextInt();
					cds = new CD[n];
					for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        cds[i] = new CD();
                        nhapCD(cds[i]);
                    }
                    break;
				}
				case 2:
					List<CD> cdAll = new ArrayList<>();
					for(CD cd : cds) {	
						cdAll.add(cd);
					}
					Utils.printf(cdAll);
                    break;
				case 3:
					 System.out.println("Tổng số lượng CD là : " + n);
	                 break;
				case 4:
					int sum = 0;
					for (int i = 0; i < n; i++) {
						sum += cds[i].getPrice();
					}
					 System.out.println("Tổng giá thành là : " + sum);
	                    break;
				case 5:
					List<CD> sortPrice = new ArrayList<>();
					for(CD cd : cds) {	
						sortPrice.add(cd);
					}
					sortPrice.sort(Comparator.comparing(CD::getPrice,Comparator.reverseOrder()));
					Utils.printf(sortPrice);
					break;
				case 6:
					List<CD> sortName = new ArrayList<>();
					for(CD cd : cds) {	
						sortName.add(cd);
					}
					sortName.sort(Comparator.comparing(CD::getTypeCD));
					Utils.printf(sortName);
					break;
						
				default:
					 	System.out.println("End");
	                    flag = false;
	                    break;
				}
		}while(flag);
		
	}
	
	
}
