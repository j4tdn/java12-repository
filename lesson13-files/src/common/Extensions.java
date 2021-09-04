package common;

public enum Extensions {
	mp3(".mp3 "),mp4(".mp4 "),txt(".txt "),java(".java "),png(".png ");
	
	private String ext;
	
	private Extensions(String ext) {
		this.ext=ext;
	}
	public String val() {
		return ext;
	}
}
