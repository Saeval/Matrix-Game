package gioco.ui;

import java.util.ArrayList;

import javax.swing.JTextField;

public class InputField extends JTextField{
	private static final long serialVersionUID = 2;

	private String input;

	public InputField(String testo) {
		super(testo);
	}

	public void readFromField() {
		this.input = getText();
	}

//	public String getInput() {
//		return input;
//	}

	public int calcolaPunteggio(ArrayList<String> arrayList) {
		int punteggio = 0;
		
		readFromField();
		System.out.println(input);		//DEBUG
		for (int i = 0; i < input.length(); i++) {
			if(arrayList.contains(input.charAt(i))){
				switch (input.charAt(i)) {
				case 'Q':
					punteggio += 2;
					break;
				case 'Z':
					punteggio += 2;
					break;
				case 'H':
					punteggio += 3;
					break;
				default:
					punteggio++;
				}
			}
		}
		return punteggio;
	}
}
