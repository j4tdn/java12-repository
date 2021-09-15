package common;

public enum ExtensionImg {
	png(".png"), jpg(".jpg");

	private final String ext;
	
	ExtensionImg(String ext) {
		this.ext = ext;
	}
	
	public String val() {
		return ext;
	}
}