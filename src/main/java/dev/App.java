package dev;

import java.io.IOException;
import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	
        String asciiArt="";
		try {
			asciiArt = FigletFont.convertOneLine(titre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(asciiArt);
        
        // affichage de l'environnement
        String environment = ResourceBundle.getBundle("application").getString("environment");
        System.out.println("Environment : " + environment);
    }
}
