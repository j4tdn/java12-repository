package ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Utils {
	static Random rd=new  Random();
	
	static String[] type = {"co","ro","chuong","bich"};
	static String[] orders = {"2","3","4","5","6","7","8","9","10","J", "Q", "K", "A"};
	
	public static List<Card> getListCard(){
		
		List<Card> cards = new ArrayList<Card>();
		int i = 0;
		while (i < 52) {
			Card card = new Card(type[rd.nextInt(3)], orders[rd.nextInt(12)]);
			if (!cards.contains(card)) {
				cards.add(card);
				i++;
			}
		}
		return cards;
	}
	
	public static void suffle( List<Card> list) {
		Collections.shuffle(list);
	}
	
	
}
