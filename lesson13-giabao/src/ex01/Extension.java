package ex01;

public enum Extension {
	mp4(".mp4"),
	mp3(".mp3"),
	txt(".txt"),
	java(".java"),
	png(".png"),
	jpg(".jpg"),
	jpeg(".jpeg"),
	bat(".bat");
	
	
	private String ext;
	Extension(String ext) {
		this.ext=ext;
	}
	public String val() {
		return ext;
	}
}
