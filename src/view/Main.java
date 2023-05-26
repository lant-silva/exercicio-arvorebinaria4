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
			System.out.println("Arvore pr� remo��o (pr�fixo): ");a.prefixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pr� remo��o (infixo): ");a.infixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore pr� remo��o (p�sfixo): ");a.postfixSearch();
			System.out.println("\n=================================");
			a.remove(7);
			a.remove(6);
			System.out.println("Arvore p�s remo��o (pr�fixo): ");a.prefixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore p�s remo��o (infixo): ");a.infixSearch();
			System.out.println("\n=================================");
			System.out.println("Arvore p�s remo��o (p�sfixo): ");a.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
