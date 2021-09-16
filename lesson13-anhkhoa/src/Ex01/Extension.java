package Ex01;

public enum Extension {
	pnq(".pnq"), jpg(".jpg"), jpeg(".jpeg"), mp3(".mp3"), mp4(".mp4"), bat(".bat"), java(".java"), txt(".txt");

	private final String text;

	private Extension(String text) {
		this.text = text; 
	}

	public String getvalue() {
		return this.text;
	}
}
