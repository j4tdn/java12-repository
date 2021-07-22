package sorting;

import utils.ArraysUtils;

public class Ex02 {
	public static void main(String[] args) {
		
		String[] sequences = {"A",null,"b",null,"C","D"};
		for(int i =0;i< sequences.length;i++) {
			for( int j =0;j<sequences.length-i-1;j++){
				
				//null first => null null abdb
				if(sequences[j]== null) {
					continue;
				}
				
				//null last=> abcb null null
//				if(sequences[j]== null) {
//					String tmp = sequences[j+1];
//					sequences[j+1]= sequences[j];
//					sequences[j] = tmp;
//					continue;
//				}
//				if(sequences[j+1]== null) {
//				continue;
//			}
				
				//previous != null
//				if(sequences[j+1]== null) {
//					String tmp = sequences[j+1];
//					sequences[j+1]= sequences[j];
//					sequences[j] = tmp;
//					continue;
//				}
				
				//previous != null
				//next != null
				if(sequences[j+1]== null||sequences[j].compareTo(sequences[j+1])>0){
					String tmp = sequences[j+1];
					sequences[j+1]= sequences[j];
					sequences[j] = tmp;
				}
			}
		}
		ArraysUtils.printf(sequences);
	}
}
