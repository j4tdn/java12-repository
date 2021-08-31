package Ex04;

public class wordEnglish {
	private String word;
	private String mean;
	private String type;
	private String note;

	public wordEnglish() {

	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public wordEnglish(String word, String mean, String type, String note) {
		super();
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.note = note;
	}

	@Override
	public String toString() {
		return "Từ =" + word + ", nghĩa =" + mean + ", loại từ =" + type + ", ghi chú =" + note;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof String))
			return false;
		wordEnglish that = (wordEnglish) o;

		return this.getWord().compareToIgnoreCase(that.getWord()) == 0;
	}
}
