//Desu é bom
package main;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Pessoa;
import model.ProviderAltura;


public class main {
	
	public static void main(String[] args){
		
		String produto1 = "Arroz";
		String produto2 = "Feijao";
		String produto3 = "Farinha";
		
		
		
		List<String> prod = new ArrayList<>();
		
		prod.add(produto1);
		prod.add(produto2);
		prod.add(produto3);
		
		System.out.println(prod);
		
		for (String produtos : prod) {
			System.out.println("produto:"+ produtos);
		}
		
		String produtoUm = prod.get(0);
		System.out.println("a primeira aula é: " + produtoUm);
		
		for (int i = 0; i < prod.size(); i++) {
			System.out.println("produto :"+ prod.get(i));
		}
		
		prod.forEach(produtos -> {
			System.out.println("percorrendo:");
			System.out.println("produto :" + produtos);});
		
	prod.add("Carne");
	System.out.println(prod);
	Collections.sort(prod);	
	System.out.println();
}
	
}