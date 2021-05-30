package builder;

import builder.Person.Builder;

public class demo {
	public static void main(String[] args) {
		Person p1 = Person.builder()
							.firstname("Gia")
							.lastname("Bao")
							.age(20)
							.builder();
		Person p2 = Person.builder()
							.lastname("khoa")
							.hobbies("Music")
							.builder();
								
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
