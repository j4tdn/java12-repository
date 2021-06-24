package ex04;

public class App {
	public static void main(String[] args) {
		People[] peoples = null;
		peoples = AppUtils.Insert();
		AppUtils.Print(peoples);
	}
}
