import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

// questa classe rappresenta una finestra con una etichetta di
// testo e un bottone. Visto che l'unico evento generato
// è la pressione del bottone, la stessa classe farà anche
// da gestore dell'evento
public class Finestra3 extends JFrame implements ActionListener {

	// memorizza un riferimento all'altra finestra
	public Finestra1 f1;
	private JTextArea textarea;
		
	// costruttore (fa tutto il lavoro)
	public Finestra3(Finestra1 f1, Classifica cla) {
		// inizializza il riferimento all'altra finestra
		this.f1 = f1;
		// costruisce tutti gli elementi di questa finestra
		textarea = new JTextArea(10,30);
		textarea.setEditable(false);
		textarea.setText(cla.visualizzaClassifica());
		JScrollPane scrollpanel = new JScrollPane(textarea);
		this.setSize(480,320);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel testo  = new JLabel("Classifica");
		JButton bottone = new JButton("Indietro");
		bottone.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(testo);
		panel.add(bottone);
		panel.add(scrollpanel);
		this.add(panel);
		// NOTA: non rende questa finestra visibile
		// ossia, non fa this.setVisible(true)
		// sara' compito dell'altra finestra rendere
		// visibile questa
	}

	// gestore dell'evento di pressione del bottone
	public void actionPerformed(ActionEvent e) {
		// nasconde la finestra corrente
		this.setVisible(false);
		// visualizza l'altra finestra
		f1.setVisible(true);
	}

}
