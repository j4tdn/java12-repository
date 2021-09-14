package ex02;

import java.util.Objects;

public class CD {
	private int id;
	private String type;
	private String singer;
	private int numOfSong;
	private double cost;
	
	public CD(int id, String type, String singer, int numberSong, double cost) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numOfSong = numberSong;
		this.cost = cost;
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
	public int getNumberSong() {
		return numOfSong;
	}
	public void setNumberSong(int numberSong) {
		this.numOfSong = numberSong;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", numOfSong=" + numOfSong + ", cost="
				+ cost + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof CD)) return false;
		CD that = (CD) obj;
		return id == that.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
