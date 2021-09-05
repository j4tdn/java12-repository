package ex05;

import java.util.Objects;



public class Expenditures {
	private String nameSpending;
	private Integer moneySpending;

	public Expenditures() {
		
	}

	public Expenditures(String nameSpending, Integer moneySpending) {
		super();
		this.nameSpending = nameSpending;
		this.moneySpending = moneySpending;
	}

	public String getNameSpending() {
		return nameSpending;
	}

	public void setNameSpending(String nameSpending) {
		this.nameSpending = nameSpending;
	}

	public Integer getMoneySpending() {
		return moneySpending;
	}

	public void setMoneySpending(Integer moneySpending) {
		this.moneySpending = moneySpending;
	}



	@Override
	public String toString() {
		return "Expenditures [nameSpending=" + nameSpending + ", moneySpending=" + moneySpending + "]";
	}
}