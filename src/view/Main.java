package view;

import model.Arvore;

public class Main {
	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
 		
		for(int index : vetor) {
			a.insert(index);
		}
		
		try {
			System.out.println("Arvore pré remoção (préfixo): ");a.prefixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pré remoção (infixo): ");a.infixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pré remoção (pósfixo): ");a.postfixSearch();
			System.out.println("\n=================================");
			a.remove(7);
			a.remove(6);
			System.out.println("Arvore pós remoção (préfixo): ");a.prefixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pós remoção (infixo): ");a.infixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pós remoção (pósfixo): ");a.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
