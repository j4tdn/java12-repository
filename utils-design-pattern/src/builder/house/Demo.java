package builder.house;

import builder.house.House.BuilderHouse;

public class Demo {
	public static void main(String[] args) {
		House houseOfA = BuilderHouse.builderHouse()
									.livingRoom("has living room")
									.kitchenRoom("has kitchen room")
									.build();
		System.out.println(houseOfA);
		House houseOfB = BuilderHouse.builderHouse()
									.amountRoom(5)
									.livingRoom("has 2")
									.yard("has back yard")
									.build();
		System.out.println(houseOfB);
	}
}
