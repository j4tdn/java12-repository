package common;

public enum Extension {
	mp4(".mp4"),
	mp3(".mp3"),
	txt(".txt"),
	java(".java"),
	png(".png");
	
	private String extension;
	
	Extension(String extension) {
		this.extension = extension;
	}
	
	public String value() {
		return extension;
	}
}
