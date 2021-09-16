package extension;

public enum Extension {
	png(".png"),
	jpg(".jpg"),
	jpeg(".jpeg"),
	mp3(".mp3"),
	mp4(".mp4"),
	bat(".bat"),
	java(".java"),
	txt(".txt");
	
	private String extention;
	
	Extension(String extension) {
		this.extention = extension;
	}
	
	public String value() {
		return extention;
	}
}
