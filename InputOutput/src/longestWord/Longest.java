package longestWord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Longest {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("longest.txt"));
		String longest="";
		String s=br.readLine();
		
		while(s!=null) {
			String [] words= s.split(" ");
			for(int i=0;i<words.length;i++) {
				if(words[i].length()>longest.length()) {
					longest= words[i];
				}
				s=br.readLine();
			}
		}System.out.println("longest word-"+ longest);
		br.close();
	}

}
