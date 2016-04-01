package gioco.ui;

import javax.swing.JTextField;

public class InputField extends JTextField{
	private static final long serialVersionUID = 2;
	
	private static final int LUNGHEZZA_RIGA = 9;

	private String stringaInseritaDaUtente;

	public InputField(String testo) {
		super(testo);
	}

	public void readFromField() {
		this.stringaInseritaDaUtente = getText();
	}

//	public String getInput() {
//		return input;
//	}

	public int calcolaPunteggio(String verifica) {
		int punteggio = 0;
		
		readFromField();
//		System.out.println(input);		//DEBUG
		for (int i = 0; i < stringaInseritaDaUtente.length(); i++) {
//			verifica = arrayList.subList(i, i+LUNGHEZZA_RIGA).toString();
			if(verifica.contains(stringaInseritaDaUtente.toUpperCase())){
				switch (stringaInseritaDaUtente.charAt(i)) {
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
