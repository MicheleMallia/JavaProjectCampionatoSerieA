import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.*;
import javax.swing.*;

// questa classe rappresenta una finestra con una etichetta di
// testo e un bottone. Visto che l'unico evento generato
// è la pressione del bottone, la stessa classe farà anche
// da gestore dell'evento
public class Finestra1 extends JFrame implements ActionListener {

	// memorizza un riferimento all'altra finestra
	public Finestra2 f2;
	public Finestra3 f3;
	private JTextArea textarea;
	
	// costruisce un oggetto Finestra1
	public static void main(String[] args) {
		Finestra1 f1 = new Finestra1();
	}
	
	// costruttore (fa tutto il lavoro)
	public Finestra1() {
		Vector <Squadra> squadre = new Vector <Squadra> ();
		ListaSquadre l = new ListaSquadre();
		// crea l'altra finestra passandogli this
		// e salva il riferimento in f2
		l.creaLista(squadre);
		Calendario c = new Calendario(l);
		c.AlgoritmoDiBerger2(l);
		c.esitoPartite();
		Classifica cla = new Classifica();
		cla.CostruisciClassifica(c, l);
		f2 = new Finestra2(this, c);
		f3 = new Finestra3(this, cla);
		textarea = new JTextArea(10,30);
		textarea.setEditable(false);
		textarea.setText(c.visualizzaCalendario());
		JScrollPane scrollpanel = new JScrollPane(textarea);
		// costruisce tutti gli elementi di questa finestra
		this.setSize(480,320);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel testo  = new JLabel("Calendario");
		JButton bottone = new JButton( new AbstractAction("Esito Partite") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	        	f2.setVisible(true);
	        }
	    });
		JButton bottone2 = new JButton( new AbstractAction("Classifica") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	        	f3.setVisible(true);
	        }
	    });
		bottone.addActionListener(this);
		bottone2.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(testo);
		panel.add(bottone);
		panel.add(bottone2);
		panel.add(scrollpanel);
		// visualizza tutto
		this.add(panel);
		//this.add(panel);
		// visualizza la finestra
		this.setVisible(true);
	}

	// gestore dell'evento di pressione del bottone
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
