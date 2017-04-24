package com.EntradaSaida;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(new FileInputStream(FileDescriptor.in));
		
		PrintWriter saida = new PrintWriter(new FileOutputStream(FileDescriptor.out));
		
		PrintWriter arquivo = new PrintWriter("src\\com\\EntradaSaida\\filmes.txt");
		
		saida.println("Queremos saber seus 4 filmes favoritos: ");
		saida.flush();
		
		for (int i = 0; i <4; i++ ){
			saida.print("Nome do Filme: ");
			saida.flush();
			String nome = entrada.nextLine();
			arquivo.println(nome);
		}
		saida.println("Obrigado por Participar da Pesquisa!!!");
		saida.println("Os dados foram gravados em src/com.EntradaSaida\\filmes.txt");
		saida.flush();
		
		entrada.close();
		saida.close();
		arquivo.close();
	}

}
