package 단어장;

import java.util.Objects;

public class Word {
	private String word;
	private String mean;

	public Word() {
	}

	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public void printWord() {
		System.out.println("　　　" + word + " " + mean);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word +" " + mean;
	}
	
	

//	@Override
//	public int compareTo(Word word) {
//		
//		return this.word.compareToIgnoreCase(word.word);
//	}

}
