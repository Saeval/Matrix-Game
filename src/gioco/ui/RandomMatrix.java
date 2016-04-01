package gioco.ui;

import gioco.RandomLettersGenerator;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class RandomMatrix extends JTextArea{
	private static final long serialVersionUID = 1;
	
	private static final int DIMENSIONE_LATO = 9;
	private static final int NUMERO_MINIMO_VOCALI = 45;
	
	private RandomLettersGenerator randomizer = new RandomLettersGenerator();
	private ArrayList<Character> lettersInMatrix = new ArrayList<Character>();
	
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
	
	public ArrayList<Character> getLettersInMatrix() {
		return lettersInMatrix;
	}
	
}
