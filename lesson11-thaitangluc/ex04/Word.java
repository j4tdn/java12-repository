package ex04;

import java.util.Objects;

public class Word {
	private String word;
	private String means;
	private String type;
	private String note;
	
	public Word() {
	}

	public Word(String word, String means, String type, String note) {
		this.word = word.toLowerCase();
		this.means = means;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word.toLowerCase();
	}

	public String getMeans() {
		return means;
	}

	public void setMeans(String means) {
		this.means = means;
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

	@Override
	public String toString() {
		return "[word=" + word + ", means=" + means + ", type=" + type + ", note=" + note + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Word)) return false;
		Word that = (Word) obj;
		return this.word.equalsIgnoreCase(that.word);
	}
	
	public int compareTo(String word) {
		return this.getWord().compareToIgnoreCase(word);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
}
