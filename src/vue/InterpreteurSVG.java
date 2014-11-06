package vue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import langage.Dessin;

public class InterpreteurSVG implements Interpreteur {

	@Override
	public File interpreter(Dessin dessin) {
		// TODO Auto-generated method stub
		File file = new File("DessinInterprete.svg");
		
		try {
			PrintWriter ecrire = new PrintWriter(new FileOutputStream("DessinInterprete.svg"));
			ecrire.println("<?xml version='1.0'?>");
			ecrire.println("<svg xmlns='http://www.w3.org/2000/svg' width='550' height='300'>");
			
			// On ecrit ici notre dessin
			
			ecrire.println("</svg");
			ecrire.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return file;
	}
	
	public static void main(String[] args) {
		InterpreteurSVG intSVG = new InterpreteurSVG();
		Dessin dessin = new Dessin("Dessin");
		intSVG.interpreter(dessin);
	}

}
