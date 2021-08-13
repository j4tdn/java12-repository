package collection.baitap3;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int id;
	private String name;
	
	public Player() {
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", quarterOfDeck=]";
	}
	
	public List<Card> quarterOfDeck = null;
	
	
	public List<Card> getQuarterOfDeck() {
		if(quarterOfDeck == null) {
			quarterOfDeck =  new ArrayList<>();
		}
		return quarterOfDeck;
	}
}
