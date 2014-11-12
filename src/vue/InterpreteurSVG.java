package vue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import langage.Dessin;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class InterpreteurSVG implements Interpreteur {

	@Override
	public File interpreter(Dessin d) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(d.getName());
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
		output.newLine();
		output.write("<?xml version=\"1.0\" standalone=\"no\"?>");
		output.newLine();
		output.write("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">");
		output.newLine();
		output.write("<svg width=" + d.getLargeur() + " height=" + d.getLongueur() + " version=1.1 xmlns=\"http://www.w3.org/2000/svg\">");
		output.newLine();
		output.close();
		return file;
	}

}
