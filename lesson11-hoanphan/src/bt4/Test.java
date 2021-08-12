package bt4;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	static void nhap(EngWord ew) {
		  System.out.println("Nhap word: ");
		  ew.setWord(sc.nextLine());
		  System.out.println("Nhap mean: ");
		  ew.setMean(sc.nextLine());
		  System.out.println("Nhap type: ");
		  ew.setType(sc.nextLine());
		  System.out.println("Nhap note: ");
		  ew.setNotes(sc.nextLine());
		  
	  }
	public static void main(String[] args) {
		EngWord[] ews = null;
		System.out.println("Nhap so luong tu : ");
		int n = sc.nextInt();
		sc.nextLine();
		ews = new EngWord[n];
		for (int i = 0; i < n; i++) {
            System.out.println("Tu thứ " + (i + 1)+": ");
            ews[i] = new EngWord();
            nhap(ews[i]);
        }

		Dictionary dict = new Dictionary();
		for(EngWord ew: ews) {
			dict.addWord(ew);
		}
		System.out.println("Danh sach cac tu co trong tu dien la : ");
		System.out.println(dict);
		
		EngWord ew = new EngWord("run", "chay", "v", "");

		if(!dict.addWord(ew)) {
			System.out.println("Khong them duoc!");
		}
		else{dict.addWord(ew);}
		
		EngWord lu = dict.lookWord("run");
		if(lu != null)
			System.out.println(lu.toString());
	}

}
