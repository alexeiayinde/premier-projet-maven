package dev;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        String asciiArt="";
		try {
			asciiArt = FigletFont.convertOneLine("App");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(asciiArt);
    }
}
