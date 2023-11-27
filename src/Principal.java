
public class Principal {
	public static void main(String[] args) {

		AVL avlTeste = new AVL(20);
		
		avlTeste.insert(21);		
		avlTeste.insert(15);
		avlTeste.insert(16);
		avlTeste.insert(11);
		avlTeste.insert(13);
		avlTeste.insert(10);
		avlTeste.insert(23);
		avlTeste.insert(9);
		
		
		System.out.println("Grau da Raiz: " +  avlTeste.getRoot().length());
		System.out.print("Pr� ordem: ");
		avlTeste.preOrderPrint();
		System.out.println("");
		System.out.print("Em ordem: ");
		avlTeste.inOrderPrint();
		System.out.println("");
		System.out.print("P�s ordem: ");
		avlTeste.postOrderPrint();
		System.out.println("");
		System.out.print("� estritamente bin�ria: ");
		System.out.print(avlTeste.isStrictBinaryTree());
		System.out.println("");
		//System.out.print("Quantidade de n�s: ");
		//System.out.println(avlTeste.findNodeAmount());

		//System.out.print("Quantidade m�xima de n�veis (profundidade): ");
		//System.out.println(avlTeste.findDepth());

		System.out.print("Altura do n� 21: ");
		System.out.println(avlTeste.search(21,avlTeste.getRoot()).getHeight());
		

		
		System.out.print("Fator de Balanceamento do n� 20: ");
		System.out.println(avlTeste.getBalanceFactor(avlTeste.search(20,avlTeste.getRoot())));
		
		//System.out.println(arvoreBinariaTeste.getSuccessor(18));

		//System.out.println(avlTeste.delete(21));
		//System.out.println(avlTeste.delete(20));
		//System.out.println(avlTeste.delete(10));
		System.out.print("Quantidade de n�s: ");
		System.out.println(avlTeste.findNodeAmount());

		System.out.print("Em ordem: ");
		avlTeste.inOrderPrint();	
		
		System.out.println();
		System.out.println("Raiz: " + avlTeste.getRoot().getValue());
		
		
		
		
	}

}
