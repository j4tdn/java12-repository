package builder.computer;

public class Computer {
	private String monitor;
	private String cpu;
	private String keyboard;
	private String mouse;
	private String speaker;
	
	private Computer(BuilderComputer builderComputer) {
		this.monitor = builderComputer.monitor;
		this.cpu = builderComputer.cpu;
		this.keyboard = builderComputer.keyboard;
		this.mouse = builderComputer.mouse;
		this.speaker = builderComputer.speaker;
	}

	public String getMonitor() {
		return monitor;
	}

	public String getCpu() {
		return cpu;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public String getSpeaker() {
		return speaker;
	}

	@Override
	public String toString() {
		return "Computer [monitor=" + monitor + ", cpu=" + cpu + ", keyboard=" + keyboard + ", mouse=" + mouse
				+ ", speaker=" + speaker + "]";
	}
	
	public static class BuilderComputer{
		private String monitor;
		private String cpu;
		private String keyboard;
		private String mouse;
		private String speaker;
		
		private BuilderComputer() {
			
		}
		
		public BuilderComputer monitor(String monitor) {
			this.monitor = monitor;
			return this;
		}
		
		public BuilderComputer cpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		
		public BuilderComputer keyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}
		
		public BuilderComputer mouse(String mouse) {
			this.mouse = mouse;
			return this;
		}
		
		public BuilderComputer speaker(String speaker) {
			this.speaker = speaker;
			return this;
		}
		
		public static BuilderComputer builder() {
			return new BuilderComputer();
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
