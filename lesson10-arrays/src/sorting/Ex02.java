package sorting;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"A",null,"b","D","a","B"};
	
		for(int i = 0 ; i< sequences.length-1; i++) {
			for(int j = 0; j < sequences.length-i-1; j++ ) {
				
				//null first >>null null A B D a b
				//null last >> A B D a b null null 
				if(sequences[j]==null) {
					String tmp = sequences[j];
					sequences[j] = sequences[j+1];
					sequences[j+1] = tmp;
					continue;
				}
				
				//prrevious != null
				if(sequences[j+1]==null) {
				
					continue;
				}
				
				if(sequences[j].compareTo(sequences[j+1]) >0){
					String tmp = sequences[j];
					sequences[j] = sequences[j+1];
					sequences[j+1] = tmp;
				}
			}
		}
		
		ArrayUtils.printf(sequences);
			
	}

}
