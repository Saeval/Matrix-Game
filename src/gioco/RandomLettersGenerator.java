package gioco;

import java.util.ArrayList;
import java.util.Collections;

public class RandomLettersGenerator {
	
	private static final String LETTERE_ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String VOCALI = "AEIOU";
	
	public void randomizeMatrixLetters(int vocali, int totale, ArrayList<String> arrayList){
		for (int i = 0; i < vocali; i++) 
			arrayList.add(String.valueOf( VOCALI.charAt((int)((Math.random()) * 5))));
		
		for (int j = 0; j < totale * totale - vocali; j++)
			arrayList.add(String.valueOf(LETTERE_ALFABETO.charAt((int) ((Math.random()) * 26))));

		Collections.shuffle(arrayList);
	}

}