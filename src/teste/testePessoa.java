package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import model.Pessoa;
import model.ProviderAltura;

public class testePessoa {
	
	
	
	@Test
	public void testeArray(){
	
	List<Pessoa> lista = new ArrayList<>();
	
	Pessoa p1 = new Pessoa("45334", "Julia", 1.58);
	Pessoa p2 = new Pessoa("3443", "Joao", 1.58);
	Pessoa p3 = new Pessoa("222", "jose", 1.58);
	Pessoa p4 = new Pessoa("3333", "maria", 1.58);
	
	lista.add(p1);
	lista.add(p2);
	lista.add(p3);
	lista.add(p4);
	
	for (Pessoa l: lista){
		System.out.println(l.getNome());
		
	
	}
	
	
}
	@Test
	public void testMap(){
	
	// através do método construtor 
		
	Pessoa p1 = new Pessoa("9389823923", "juliana", 2.2);
	Pessoa p2 = new Pessoa("2382387", "carlos", 1.27);
	Pessoa p3 = new Pessoa("98239823", "karol", 2.22);
	Pessoa p4 = new Pessoa("292389238", "cesar", 1.88);
	
	Map<String, Pessoa> mapa = new HashMap<>();
	
	mapa.put(p1.getCpf(), p1); mapa.put(p2.getCpf(), p2);
	mapa.put(p3.getCpf(), p3); mapa.put(p4.getCpf(), p4);
	
	for (Map.Entry<String, Pessoa> elemento: mapa.entrySet()){
		System.out.println(elemento.getKey());
		System.out.println(elemento.getValue().getNome());
	}
	
	
	}
	
	
	@Test
	public void testSort(){
	
	Pessoa p1 = new Pessoa("10920", "Roberto", 1.67);
	Pessoa p2 = new Pessoa("323232", "Rodrigo",1.43);
	Pessoa p3 = new Pessoa("656465", "Monica", 1.33);
	Pessoa p4 = new Pessoa("54656565", "Gaspar", 1.99);
	
	List<Pessoa> lista = new ArrayList<>();
	
	lista.add(p1);
	lista.add(p2);
	lista.add(p3);
	lista.add(p4);
	
	Collections.sort(lista, new ProviderAltura());
	
	
	
	for (Pessoa p: lista){
		System.out.println(p.getNome());
	
	
	}
	}
	
}