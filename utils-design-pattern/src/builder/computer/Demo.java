package builder.computer;

import builder.computer.Computer.BuilderComputer;

public class Demo {
	public static void main(String[] args) {
		Computer nhat = BuilderComputer.builder()
											. monitor("LG")
											.cpu("intel")
											.mouse("gear")
											.speaker("Sony")
											.build();
		System.out.println(nhat);
	}
}
