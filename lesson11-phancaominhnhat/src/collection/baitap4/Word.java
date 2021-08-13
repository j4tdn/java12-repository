package collection.baitap4;

public class Word {
	private String word;
	private String meaning;
	private String type;
	private String example;
	
	public Word() {
	}

	public Word(String word, String meaning, String type, String example) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.type = type;
		this.example = example;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", type=" + type + ", example=" + example + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Word)) {
			return false;
		}
		Word that = (Word) obj;
		return getWord().equalsIgnoreCase(that.getWord());
	}
	
	public int compareTo(Object obj) {
		return getWord().compareToIgnoreCase(((Word) obj).getWord());
	}
}
