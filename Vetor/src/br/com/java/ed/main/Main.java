package br.com.java.ed.main;

import java.util.Scanner;

import br.com.java.ed.implementation.Supermarket;
import br.com.java.ed.implementation.SupermarketArray;

public class Main { //classe executavel
	private final static int SIZE = 3; //tamanho fixo do vetor (desvantagem)
	
	public static void main (String[] args) { //método main
		Scanner scanner = new Scanner(System.in); //ler o teclado que o usuario vai indicar
		
		Supermarket supermarket = new SupermarketArray(SIZE);
		
		int opcao; //armazenando em uma variável
		do { //laço
			System.out.println("\nLista de Compras");
			System.out.println("1 - Inserir");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt(); //aguardando a opção do usuário final
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o item a ser inserido: ");
				String item = scanner.next();
				supermarket.add(item);
				break;
			case 2:
				supermarket.print();
				break;
			case 3:
				System.out.print("Digite a posição do item a ser removido: ");
				int index = scanner.nextInt();
				supermarket.delete(index);
				break;
			case 4:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção invalida. Por favor, escolha novamente.");
					
			}
		} while (opcao != 4);
		
		scanner.close();
	}
	//21min
}
