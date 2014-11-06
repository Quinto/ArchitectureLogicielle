package vue;

import java.io.File;
import java.io.IOException;

import langage.Dessin;

public interface Interpreteur {

	public File interpreter(Dessin d) throws IOException;

}
