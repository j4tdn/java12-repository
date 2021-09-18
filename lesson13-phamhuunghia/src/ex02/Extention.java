package ex02;

public enum Extention {
	png(".png"),
	jpg(".jpg");
	private String ext;
	
	private Extention(String ext) {
		this.ext = ext;
	}
	public String val() {
		return ext;
	}
}
