package control;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:
		case 10:System.out.println("31 days");
		break;
		case 4: System.out.println("30 days");
		default:
			System.out.println("Invalid");
			break;
		}
	}

}