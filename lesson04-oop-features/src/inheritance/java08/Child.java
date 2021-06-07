package inheritance.java08;

public class Child implements Father,Mother {

	@Override
	public void adn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSports() {
		// TODO Auto-generated method stub
		Father.super.playSports();
		Mother.super.playSports();
	}

	

	
}
