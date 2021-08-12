package bt4;

import java.util.TreeMap;

public class Dictionary {

	public TreeMap<String, EngWord> dict ;
	
	public Dictionary(){
		dict = new TreeMap<String,EngWord>();
	}
	
	public boolean addWord(EngWord ew) {
		if(dict.put(ew.getWord().toLowerCase(), ew) != null ) {
			return false;
		}
		return true;
	}
	
	public EngWord lookWord (String word) {
		return dict.get(word);
	}
	

	public String toString() 
	{
		String ret = "";
		for(EngWord w:dict.values())
			ret += w.toString()+"\n";
		return ret;
	}

		

}
