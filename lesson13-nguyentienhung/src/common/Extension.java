package common;

public enum Extension {
	png(".png"),
	jpg(".jpg"),
	jpeg(".jpeg"),
	mp3(".mp3"),
	mp4(".mp4"),
	bat(".bat"),
	java(".java"),
	txt(".txt");
	
	private final String message;
	
	 Extension(String ext) {
		 this.message = ext;
	}
	 
	 public String val() {
		 return message;
	 }
}