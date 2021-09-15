package common;

public enum Extension {
	mp4(".mp4"), mp3(".mp3"), txt(".txt"), java(".java"), png(".png"), jpeg(".jpeg"), jpg(".jpg"), bat(".bat");

	private final String ext;
	
	Extension(String ext) {
		this.ext = ext;
	}
	
	public String val() {
		return ext;
	}
}