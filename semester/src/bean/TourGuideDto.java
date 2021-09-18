package bean;

public class TourGuideDto {
	private String id;
	private int point;
	private Level level;
	
	public TourGuideDto() {
	}

	public TourGuideDto(String id, int point, Level level) {
		this.id = id;
		this.point = point;
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "TourGuideDto [id=" + id + ", point=" + point + ", level=" + level + "]";
	}
}
