package gioco;

import java.util.ArrayList;
import java.util.Collections;

public class RandomLettersGenerator {
	
	private static final String LETTERE_ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String VOCALI = "AEIOU";
	
	public void randomizeMatrixLetters(int vocali, int totale, ArrayList<Character> arrayList){
		
		for (int i = 0; i < vocali; i++) 
			arrayList.add(VOCALI.charAt((int)((Math.random()) * 5)));
		
		for (int j = 0; j < totale-vocali; j++)
			arrayList.add(LETTERE_ALFABETO.charAt((int) ((Math.random()) * 26)));
		
		Collections.shuffle(arrayList);
		
//		System.out.print(arrayList.size());
	}

}
