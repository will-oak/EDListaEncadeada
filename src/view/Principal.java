package view;

import controller.ListaController;
import felix.utils.listaencadeada.integer.ListaEncadeadaSimples;
import felix.utils.listaencadeada.integer.No;

public class Principal {

	public static void main(String[] args) {
		
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		ListaController controller = new ListaController();
		//lista.tamanho;
		
		lista.adicionaPrimeiroElemento(new No(10));
		
		for (int i = 1; i < 10; i++) {
			lista.adicionaElemento(new No(i));
		}

		lista.adicionaElemento(new No(10));
		lista.adicionaElemento(new No(10));
		lista.adicionaElemento(new No(10));
		
		System.out.println(controller.estaEmOrdem(lista));
		System.out.println(controller.encontraNumeroRecursivo(lista, lista.getTamanho(), 20));
		System.out.println(controller.encontraNumeroIterativamente(lista, 20));
		
		System.out.println(lista.toString());
		
		
	}

}
