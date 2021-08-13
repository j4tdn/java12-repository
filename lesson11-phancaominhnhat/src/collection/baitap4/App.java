package collection.baitap4;

import java.util.Scanner;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static Dictionary dictionary = new Dictionary();
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println("-------------Menu-------------");
		System.out.println("1. Add new word to dictionary");
		System.out.println("2. Search new word in dictionary");
		System.out.println("3. List dictionary");
		System.out.println("4. Exit program");
		System.out.print("Enter your choose: ");
		
		switch (scanner.nextInt()){
			case 1: {
				Word word = new Word();
				System.out.print("Enter a word: ");
				scanner.nextLine();
				word.setWord(scanner.nextLine());
				System.out.print("Enter means of word: ");
				word.setMeaning(scanner.nextLine());
				System.out.print("Enter type of the word: ");
				word.setType(scanner.nextLine());
				System.out.print("Enter example: ");
				word.setExample(scanner.nextLine());
				dictionary.add(word);
				break;
			}
			case 2: {
				System.out.print("Please enter a word which you need to search: ");
				scanner.nextLine();
				String wordSearched = scanner.nextLine();
				System.out.println(dictionary.search(wordSearched));
				break;
			}
			case 3: {
				dictionary.show();
				break;
			}
			case 4: {
				System.exit(0);
			}
		}
		menu();
	}
}
