package builder.house;

/**
 * @author minhnhat
 */

public class House {
	private String livingRoom;
	private String kitchenRoom;
	private String pool;
	private String yard;
	private int amountRoom;
	
	private House(BuilderHouse builderHouse) {
		this.livingRoom = builderHouse.livingRoom;
		this.kitchenRoom = builderHouse.kitchenRoom;
		this.pool = builderHouse.pool;
		this.yard = builderHouse.yard;
		this.amountRoom = builderHouse.amountRoom;
	}

	public String getLivingRoom() {
		return livingRoom;
	}

	public String getKitchenRoom() {
		return kitchenRoom;
	}

	public String getPool() {
		return pool;
	}

	public String getYard() {
		return yard;
	}

	public int getAmountRoom() {
		return amountRoom;
	}

	@Override
	public String toString() {
		return "House [livingRoom=" + livingRoom + ", kitchenRoom=" + kitchenRoom + ", pool=" + pool + ", yard=" + yard
				+ ", amountRoom=" + amountRoom + "]";
	}
	
	public static class BuilderHouse {
		private String livingRoom;
		private String kitchenRoom;
		private String pool;
		private String yard;
		private int amountRoom;
		
		private BuilderHouse() {
			// TODO Auto-generated constructor stub
		}
		public BuilderHouse livingRoom(String livingRoom) {
			this.livingRoom = livingRoom;
			return this;
		}
		
		public BuilderHouse kitchenRoom(String kitchenRoom) {
			this.kitchenRoom = kitchenRoom;
			return this;
		}
		
		public BuilderHouse pool(String pool) {
			this.pool = pool;
			return this;
		}
		
		public BuilderHouse yard(String yard) {
			this.yard = yard;
			return this;
		}
		
		public BuilderHouse amountRoom(int amountRoom) {
			this.amountRoom = amountRoom;
			return this;
		}
		
		public static BuilderHouse builderHouse() {
			return new BuilderHouse();
		}
		
		public House build() {
			return new House(this);
		}
		
	}
}
