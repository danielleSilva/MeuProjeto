package br.edu.ifms.tads.dbf2.web;

import java.util.ArrayList;
import java.util.List;


public class buscaTipo {
	  
	public static List<String> doces(){
		List<String> doces = new ArrayList<String>();
		
		doces.add("Pudim");
		doces.add("Suspiro");
		doces.add("Bolo Chocolate");
		
		return doces;
		
	}
	
	public static List<String> salgados(){
		List<String> salgados = new ArrayList<String>();
		
		salgados.add("saltenha");
		salgados.add("enroladinho");
		salgados.add("coxinha");
		
		return salgados;
		
	}
	
	
	/*Exercício:
	 * fazer lista salgados
	 * quando digitar doce mostrar lista de doces
	 * quando digitar salgados mostrar lista de salgados
	 * outra retornar frase = item não cadastrado
	 * 
	 * */
	

}
