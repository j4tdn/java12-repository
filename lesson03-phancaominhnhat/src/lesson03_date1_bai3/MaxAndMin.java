package lesson03_date1_bai3;

public class MaxAndMin {
	private int elementRow;
	private int elementCol;
	private int value;
	
	public MaxAndMin() {
		// TODO Auto-generated constructor stub
	}

	public MaxAndMin(int elementRow, int elementCol, int value) {
		this.elementRow = elementRow;
		this.elementCol = elementCol;
		this.value = value;
	}

	public int getElementRow() {
		return elementRow;
	}

	public void setElementRow(int elementRow) {
		this.elementRow = elementRow;
	}

	public int getElementCol() {
		return elementCol;
	}

	public void setElementCol(int elementCol) {
		this.elementCol = elementCol;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return  " [elementRow=" + elementRow + ", elementCol=" + elementCol + ", value=" + value + "]";
	}
}
