package view;

import java.io.*;

public class Principal {
	
	public static void main(String x[]) {
		try {
			BufferedReader ler = new BufferedReader(new FileReader("C:\\temp\\generic_food.csv"));
			
			String linha;
			while ((linha = ler.readLine()) != null) {
		        String[] dados = linha.split(",");
		        // FOOD NAME, SCIENTIFIC NAME, GROUP, SUB GROUP
		        String nome = dados[0];
		        String scientNome = dados[1];
		        String grupo = dados[2];
		        String subGrupo = dados[3];
	
		        if (grupo.equals("Fruits")) {
		            System.out.printf("%-30s %-35s %-25s%n", nome, scientNome, subGrupo); 
		        }
			}
			
			ler.close();
			
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}
