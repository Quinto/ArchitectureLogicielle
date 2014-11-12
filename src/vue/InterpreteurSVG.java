package vue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import langage.Dessin;
import langage.Ligne;
import langage.Objet;

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
		output.write("<?xml version=\"1.0\" standalone=\"no\"?>");
		output.newLine();
		output.write("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">");
		output.newLine();
		output.write("<svg width=\"" + d.getLargeur() + "\" height=\"" + d.getLongueur() +
				"\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">");
		output.newLine();
		for(Objet o : d.getObjets()) {
			output.write(this.interpreterObjet(o));
			output.newLine();
		}
		output.write("</svg>");
		output.close();
		return file;
	}

	private String interpreterObjet(Objet o) {
		// TODO Auto-generated method stub
		String s = "";
		if(o instanceof Ligne) {
			s+="<line x1=\"" + ((Ligne) o).getX1().getX() + "\" y1=\"" + ((Ligne) o).getX1().getY() +
					"\" x2=\"" + ((Ligne) o).getX2().getX() + "\" y2=\"" + ((Ligne) o).getX2().getY() +
					"\" style=\"fill:#0000ff;fill-opacity:0.75;stroke:#000000;stroke-width:1px\" />";
		}
		return s;
	}

}
