package vue;

import java.io.File;

import langage.Dessin;

public class InterpreteurSVG implements Interpreteur {

	@Override
	public File interpreter(Dessin d) {
		// TODO Auto-generated method stub
		File file = new File("Dessin interprete");
		return file;
	}

}
