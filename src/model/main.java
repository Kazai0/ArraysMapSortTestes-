package model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {
	
	public static void main(String[] args){
		
		List<Pessoa> lista = new ArrayList<>();
		
		Pessoa p = new Pessoa("3443", "Joao", 1.58);
		Pessoa p2 = new Pessoa("222", "jose", 1.58);
		Pessoa p3 = new Pessoa("3333", "maria", 1.58);
		
		lista.add(p);
		lista.add(p2);
		lista.add(p3);
		
		for (Pessoa l: lista){
			System.out.println(l.getNome());
			
		}
		
		
	
//		List<String> lista = new ArrayList<>();
//		
//		lista.add("antonio");
//		lista.add("juliana");
//		lista.add("Cesar");
//		lista.add("carlos");
//		
//		lista.remove("juliana");
//		
//
//		for(String s: lista)
//			System.out.println(s);
//		
//		List<Pessoa> lista = new ArrayList<>();
//		
//		Pessoa p1 = new Pessoa("9389823923", "juliana");
//		Pessoa p2 = new Pessoa("2382387", "carlos");
//		Pessoa p3 = new Pessoa("98239823", "karol");
//		Pessoa p4 = new Pessoa("292389238", "cesar");
//		
//		lista.add(p1); 
//		lista.add(p2); 
//		lista.add(p3); 
//		lista.add(p4);
//		
//		lista.remove(p1);
//		
//		for (Pessoa p: lista){
//			System.out.println(p.getNome());
//		}
		

//		
//		
//
//		String p1 = "Juliana";
//		String p2 = "Karol";
//		String p3 = "Scarlett";
//		String p4 = "Juliana";
//		
//		Set<String> conjunto = new HashSet<>();
//		conjunto.add(p1); conjunto.add(p2);
//		conjunto.add(p3); conjunto.add(p4);
//		conjunto.remove("juliana");
//		
////		for(String string : conjunto){
////			System.out.println(string);
//		
//		if(conjunto.contains("karol")){
//			System.out.println("Karol está no conjunto");
//		}
//		else{
//		
//			System.out.println("KArol nao está no conjunto");
//	
//			conjunto.clear();
//		
		
//		Pessoa p1 = new Pessoa("9389823923", "juliana");
//		Pessoa p2 = new Pessoa("9389823923", "juliana");
//		
//		if(p1 == p2){
//			System.out.println("são iguais");
//		}
//		else
//		{
//			System.out.println("são diferentes");
//		}
//		
//		if (p1.equals(p2)){
//			System.out.println("sao iguais");
//			
//		}
//		else{
//			System.out.println("sap diferentes");
////				
////		
////		
////		}
//		
//		

//		}
//		
		

}
}