package ex02;

public class CD {
    private int id;
    private String name;
    private String type;
    private String singer;
    private int numberOfTracks;
    private double price;

    public CD() {
    }

    public CD(int id, String name, String type, String singer, int numberOfTracks, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.singer = singer;
        this.numberOfTracks = numberOfTracks;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", singer='" + singer + '\'' +
                ", numberOfTracks=" + numberOfTracks +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CD)) {
            return false;
        }
        CD that = (CD) o;
        return id == that.id;
    }
}
