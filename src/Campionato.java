import java.util.Vector;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
public class Campionato {

	public static void main(String[] args){
		
		int scelta;
		do{
			scelta = JOptionPane.showConfirmDialog(null,"Vuoi generare un campionato?",
					"Scelta",JOptionPane.YES_NO_OPTION);
			switch(scelta){
			case JOptionPane.YES_OPTION: generaCampionato();break;
			case JOptionPane.NO_OPTION: scelta = 0;break;
			}
		} while (scelta!=0);
		
		
		
		
		
		/*
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
		    fWriter = new FileWriter("Classifica.html");
		    writer = new BufferedWriter(fWriter);
		    writer.write(cla.toHTML());
		    writer.newLine();
		    writer.write(c.esitotoHTML());
		    writer.close(); //make sure you close the writer object 
		} catch (Exception e) {
		  //catch any exceptions here
		}
		File htmlFile = new File("Classifica.html");
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/

	}
	
	public static void generaCampionato(){
		Finestra1 f1 = new Finestra1();
	}
}
