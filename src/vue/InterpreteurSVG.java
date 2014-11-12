package vue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import langage.Cercle;
import langage.Dessin;
import langage.Ligne;
import langage.Objet;
import langage.Polygone;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class InterpreteurSVG implements Interpreteur {

	@Override
	public File interpreter(Dessin d) {
		// TODO Auto-generated method stub
		File file = new File(d.getName() + ".svg");
		try {
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
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Interpretation du dessin terminee");
		return file;
	}

	private String interpreterObjet(Objet o) {
		// TODO Auto-generated method stub
		String s = "";
		if(o instanceof Ligne) {
			s+="<line x1=\"" + ((Ligne) o).getX1().getX() + "\" y1=\"" + ((Ligne) o).getX1().getY() + "\" x2=\"" + ((Ligne) o).getX2().getX() + "\" y2=\"" + ((Ligne) o).getX2().getY() + "\" ";
			s+="style=\"fill:none;stroke:" + ((Ligne) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Ligne) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Ligne) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Cercle) {
			s+="<circle r=\"" + ((Cercle) o).getRayon() + "\" cx=\"" + ((Cercle) o).getAbscisseCentre() + "\" cy=\"" + ((Cercle) o).getOrdonneeCentre() + "\" ";
			s+="style=\"fill:" + ((Cercle) o).getCouleurRemplissage() + ";stroke:" + ((Cercle) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Cercle) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Cercle) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Polygone) {
			s+="<polygon ";
			s+="style=\"fill:" + ((Polygone) o).getCouleurRemplissage() + ";stroke:" + ((Polygone) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Polygone) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Polygone) o).getCrayon().getLargeurBordure() + ";\" />";

		}
		return s;
	}

}
