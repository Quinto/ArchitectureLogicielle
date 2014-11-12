package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Sylla & Zaninetti
 *
 */
public class Fenetre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel zoneDeDessin = new JPanel();

	//======================================================================//
	//========================== Constructeurs =============================//
	//======================================================================//

	/**
	 * Cree une nouvelle instance de <i>Fenetre</i>.
	 *
	 * @param controleur
	 */
	public Fenetre(String nom, int largeur, int hauteur){
		this.setMinimumSize(new Dimension(470, 360));
		
		this.getZoneDeDessin().setBackground(Color.white);
    	this.getZoneDeDessin().setPreferredSize(new Dimension(largeur, hauteur));
    	this.getZoneDeDessin().revalidate();
		this.getContentPane().add(this.getZoneDeDessin());

		this.setTitle(nom +" - Dessin Vectoriel");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.pack();
	}

	public JPanel getZoneDeDessin() {
		return zoneDeDessin;
	}

	public void setZoneDeDessin(JPanel zoneDeDessin) {
		this.zoneDeDessin = zoneDeDessin;
	}

	//======================================================================//
	//============================= Methodes ===============================//
	//======================================================================//

	/**
	 * Cette methode permet de changer la dimension de la zone de dessin.
	 * 
	 * @param dimension Nouvelle dimension de la zone de dessin.
	 */
	public void changerDimensionPaneau(Dimension dimension){
		this.getZoneDeDessin().setPreferredSize(dimension);
		this.getZoneDeDessin().revalidate();
	}


	/**
	 * Cette methode permet de dessiner tous les chemins du dessin et le chemin courant dans la zone de dessin.
	 *  
	 * @param g
	 */
	public void paintAvecCheminCourant(Graphics g){
		this.paint(g);    	
	}


	@Override
	public void paint(Graphics g){
		super.paint(g);
	}

}
