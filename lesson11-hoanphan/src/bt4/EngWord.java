package bt4;

public class EngWord {

	private String word;	
	private String mean;
	private String type;	
	private String notes;

	public EngWord() 
	{
		this("","","","");
	}

	public EngWord(String word, String mean, String type, String notes) {
		super();
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.notes = notes;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof EngWord)) {
			return false;
		}
		EngWord that = (EngWord)o;
		return word.equalsIgnoreCase(that.getWord());
	}

	@Override
	public String toString() {
		return word + "; " + type + "; " + mean + "; " + notes;
	}
	
	public int compareTo(Object o) {
		
		return this.word.compareToIgnoreCase(((EngWord)o).getWord());
	}
	

}
