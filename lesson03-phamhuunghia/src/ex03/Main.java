package ex03;

public class Main {
	public static void main(String[] args) {
		Matrix matrix=new Matrix(3, 3);
		matrix.setDataMatrix();
		System.out.println(matrix);
		matrix.findSaddleOfMatrix();
	}
}
