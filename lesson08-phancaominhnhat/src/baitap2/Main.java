package baitap2;


public class Main {
	public static void main(String[] args) {
		String fullName = "aDam Le vAN john Son";
		
		while(!fullName.matches("(([a-zA-Z])*\\s*)*")) {
			System.out.println("Enter full name again: ");
		};
		
		String[] arrFullName = fullName.trim().replaceAll("\\s+", " ").split(" ");
				
		String newName = "";
		
		for(int i = 0; i < arrFullName.length; i++) {
			newName = String.join(" ", newName, vietHoaKyTuDau(arrFullName[i]));
		}
		System.out.println(newName);
	}
	
	private static String vietHoaKyTuDau(String str) {
		return str.substring(0, 1).toUpperCase() + str.toLowerCase().substring(1);
	}
}
