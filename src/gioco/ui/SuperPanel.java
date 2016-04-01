package gioco.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SuperPanel extends JPanel{
	private static final long serialVersionUID = 0;

	// private StringBuilder lettereNellaMatrice = new
	// StringBuilder(DIMENSIONE_LATO*DIMENSIONE_LATO);

	private RandomMatrix matriceDiLettere = new RandomMatrix();
	private InputField input = new InputField("Scrivi qua");
	private JButton button = new JButton("Inizia!");
	private JTextArea output = new JTextArea("Risultato");

	public SuperPanel() {
		setLayout(new GridLayout(4, 1));
		matriceDiLettere.setEditable(false);
		output.setEditable(false);
		add(matriceDiLettere);
		add(input);
		add(button);
		add(output);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				matriceDiLettere.randomInitialize();
			}
		});

		input.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int score=0;
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					for (int j = 0; j < RandomMatrix.DIMENSIONE_LATO; j++) {
//						output.setText(""+input.calcolaPunteggio(matriceDiLettere.getParolaOrizzontale(j, matriceDiLettere.getLettersInMatrix())));
						score += input.calcolaPunteggio(matriceDiLettere.getParolaVerticale(j, matriceDiLettere.getLettersInMatrix()));
						score += input.calcolaPunteggio(matriceDiLettere.getParolaOrizzontale(j*RandomMatrix.DIMENSIONE_LATO, matriceDiLettere.getLettersInMatrix()));
//						System.out.println(matriceDiLettere.getParolaVerticale(j, matriceDiLettere.getLettersInMatrix()));
					}
					output.setText(""+score);
					input.setText("");
				}
			}
		});
	}

}