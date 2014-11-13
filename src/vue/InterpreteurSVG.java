package vue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import langage.Cercle;
import langage.Dessin;
import langage.Etiqueter;
import langage.Ligne;
import langage.Objet;
import langage.Polygone;
import langage.Rectangle;

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
			s+="<line x1=\"" + ((Ligne) o).getAbscisseX1() + "\" y1=\"" + ((Ligne) o).getOrdonneeX1() + "\" x2=\"" + ((Ligne) o).getAbscisseX2() + "\" y2=\"" + ((Ligne) o).getOrdonneeX2() + "\" ";
			s+="style=\"fill:none;stroke:" + ((Ligne) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Ligne) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Ligne) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Cercle) {
			s+="<circle r=\"" + ((Cercle) o).getRayon() + "\" cx=\"" + ((Cercle) o).getAbscisseCentre() + "\" cy=\"" + ((Cercle) o).getOrdonneeCentre() + "\" ";
			s+="style=\"fill:" + ((Cercle) o).getCouleurRemplissage() + ";stroke:" + ((Cercle) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Cercle) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Cercle) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Polygone) {
			s+="<polygon points=\"";
			for(int i=0; i<((Polygone) o).getNbPoints(); i++) {
				s+=((Polygone) o).getPointsX()[i] + "," + ((Polygone) o).getPointsY()[i];
				if(i != ((Polygone) o).getNbPoints() - 1) {
					s+=" ";
				}
				else {
					s+="\" ";
				}
			}
			s+="style=\"fill:" + ((Polygone) o).getCouleurRemplissage() + ";stroke:" + ((Polygone) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Polygone) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Polygone) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Rectangle) {
			s+="<rect x=\"" + ((Rectangle) o).getAbscisseOrigine() + "\" y=\"" + ((Rectangle) o).getOrdonneeOrigine() + "\" width=\"" + ((Rectangle) o).getLongueur() + "\" height=\"" + ((Rectangle) o).getLargeur() + "\" ";
			s+="style=\"fill:" + ((Rectangle) o).getCouleurRemplissage() + ";stroke:" + ((Rectangle) o).getCrayon().getCouleur() + ";stroke-opacity:" + ((Rectangle) o).getCrayon().getOpaciteBordure() + ";stroke-width:" + ((Rectangle) o).getCrayon().getLargeurBordure() + ";\" />";
		}
		if(o instanceof Etiqueter) {
			s+="<text x=\"" + ((Etiqueter) o).getOrigineX() + "\" y=\"" + ((Etiqueter) o).getOrigineY() + "\" ";
			s+="style=\"fill:" + ((Etiqueter) o).getCouleurRemplissage() + ";";
			if(((Etiqueter) o).getCouleur() != null) {
				s+="stroke:" + ((Etiqueter) o).getCouleur() + ";";
			}
			if(((Etiqueter) o).getTaillePolice() != 0) {
				s+="font-size:" + ((Etiqueter) o).getTaillePolice() + "px;";
			}
			s+="\">" + ((Etiqueter) o).getTexte() + "</text>";
		}
		return s;
	}

}
