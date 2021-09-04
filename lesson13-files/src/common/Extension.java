package common;

public enum Extension {
    // enumeration >> special class
    // consist of constant values
    // + amount of values in enum
    // + object value


    mp4(".mp4"), // Extension mp4 = new Extension()
    mp3("mp3") ,
    txt("txt"),
    java("java"),
     png("png");

    private final String ext;

    Extension(String  ext){
        this.ext = ext;
    }

    public String val(){
        return ext;
    }
}
