package controller;

import willoak.utils.listaencadeada.integer.ListaEncadeadaSimples;

public class ListaController {

	public ListaController() {
		super();
	}
	
	
	public boolean estaEmOrdem(ListaEncadeadaSimples lista) {
		int tamanho = lista.getTamanho();
		boolean estaEmOrdem = false;
		int aux = lista.pegaElemento(0);
		int ant = lista.pegaElemento(0);
		
		for (int i = 0; i <= tamanho - 1; i++) {
			aux = lista.pegaElemento(i);
			
			if (aux >= ant) {
				estaEmOrdem = true;
			} else {
				return false;
			}
			
			ant = aux;
		}
		
		
		return estaEmOrdem;
	}
	
	public int encontraNumeroRecursivo(ListaEncadeadaSimples lista, int tamanho, int elemento) {
		if (tamanho == 0) {
			return 0;
		} else {
			int contador = 0;
			
			if (lista.pegaElemento(tamanho - 1) == elemento) {
				contador++;
			}
			
			return contador + encontraNumeroRecursivo(lista, tamanho - 1, elemento);
		}
 	}
	
	public int encontraNumeroIterativamente(ListaEncadeadaSimples lista, int elemento) {
		int tamanho = lista.getTamanho();
		int contador = 0;
		
		for (int i = 0; i <= tamanho - 1; i++) {
			if (elemento == lista.pegaElemento(i)) {
				contador++;
			}
		}
		
		
		return contador;
	}
	
	
}
