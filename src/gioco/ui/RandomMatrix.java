package gioco.ui;

import gioco.RandomLettersGenerator;
import java.util.ArrayList;
import javax.swing.JTextArea;

public class RandomMatrix extends JTextArea{
	private static final long serialVersionUID = 1;
	
	public static final int DIMENSIONE_LATO = 9;
	public static final int NUMERO_MINIMO_VOCALI = 45;
	
	private RandomLettersGenerator randomizer = new RandomLettersGenerator();
	private ArrayList<Character> lettersInMatrix = new ArrayList<Character>(DIMENSIONE_LATO*DIMENSIONE_LATO);
	
	public RandomMatrix() {
		super();
	}
	
	public void randomInitialize() {
		randomizer.randomizeMatrixLetters(
				NUMERO_MINIMO_VOCALI, 
				DIMENSIONE_LATO*DIMENSIONE_LATO, 
				lettersInMatrix
				);
		
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < lettersInMatrix.size(); i++) {
			if (i % DIMENSIONE_LATO == 0 && i!=0)
				append("\n");
			
			append(lettersInMatrix.get(i).toString());
		}
	}
	
	public String getParolaOrizzontale(int riga, ArrayList<Character> arrayList){
//		String parola = arrayList.subList(i, DIMENSIONE_LATO).toString();
		StringBuilder builder = new StringBuilder(DIMENSIONE_LATO);
		
		for (int i = 0; i < DIMENSIONE_LATO; i++) {
			builder.append(arrayList.get(riga+i));
//			System.out.println(builder);
		}
		return builder.toString();
	}
	
	public String getParolaVerticale(int offset, ArrayList<Character> arrayList){
		StringBuilder builder = new StringBuilder(DIMENSIONE_LATO);
		
		for(int i=0; i < DIMENSIONE_LATO; i++)
			builder.append(arrayList.get((i*DIMENSIONE_LATO)+offset).toString());
		
		return builder.toString();
	}
	
	public ArrayList<Character> getLettersInMatrix() {
		return lettersInMatrix;
	}
	
}
