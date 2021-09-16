package extension;

public enum Extension2 {
	png(".png"),
	jpg(".jpg");
	
	private String extention;
	
	Extension2(String extension) {
		this.extention = extension;
	}
	
	public String value() {
		return extention;
	}
}
