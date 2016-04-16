package appForecasting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Row> listaDeLinhas = new ArrayList<Row>();

	public static void main(String[] args) throws IOException, FileNotFoundException {

		String filePath = args[0];
		String periodoString = args[1];
		String alphaString = args[2];
		String betaString = args[3];
		String gammaString = args[4];

		Integer periodo = Integer.parseInt(periodoString);
		Float alpha = Float.parseFloat(alphaString);
		Float beta = Float.parseFloat(betaString);
		Float gamma = Float.parseFloat(gammaString);

		FileReader reader = new FileReader(filePath);
		BufferedReader fileReader = new BufferedReader(reader);
		String linha = fileReader.readLine();
		while (linha != null) {
			Float valorLinha = Float.parseFloat(fileReader.readLine());
			Row novaLinha = new Row(valorLinha);
			listaDeLinhas.add(novaLinha);
		}
		for (int i = 0; i < listaDeLinhas.size(); i++) {
			System.out.println(listaDeLinhas.get(i));
		}
		
	}

}
